package stoyanov.venislav.btripweb.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.constants.ErrorMessage;
import org.example.engine.BusinessTripForm;
import org.example.engine.TripTypeSelector;
import org.example.utillity.BTripGetDaysFromCheckboxesOrFields;
import org.example.utillity.FieldValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import stoyanov.venislav.btripweb.model.BTrip;

import javax.xml.validation.Validator;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BTripController {

    @GetMapping("/")
    public String showTripForm(Model model) {
        model.addAttribute("bTrip", new BTrip());
        return "tripTemplate";
    }

    @PostMapping("/showImages")
    public String submitTrip(@ModelAttribute("bTrip") BTrip bTrip, Model model) {

        //validation of digit fields

        if (bTrip.getIsTravelWithYourVehicle()) {
            try {
                validateVehicleFields(bTrip);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        if (bTrip.getIsNightStayedInHotel()) {
            try {
                validateNightStayFields(bTrip);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        try {
            validateCommonFields(bTrip);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        bTrip.setDays(BTripGetDaysFromCheckboxesOrFields.getDays(bTrip));
        if (bTrip.getDays() == null || bTrip.getDays().isEmpty()) {
            throw new RuntimeException();
        }
        FieldValidator.validateNumberOfDaysEqualsInputDays(String.valueOf(bTrip.getNumberOfDays()), bTrip.getDays());

        //end the validation section

        List<BufferedImage> imageList = new ArrayList<>();
        TripTypeSelector.select(bTrip, imageList);
        // Convert each image to Base64
        List<String> base64ImageList = imageList.stream()
                .map(image -> {
                    try {
                        return convertImageToBase64(image);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList());

        System.out.println(bTrip);

            // Add the list to the model
        model.addAttribute("base64ImageList", base64ImageList);

        //pass the sheets to processTripTemplate, to be looped and displayed to the user
        return "processedTripTemplate";
    }

    private String convertImageToBase64(BufferedImage image) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        javax.imageio.ImageIO.write(image, "png", baos);
        byte[] bytes = baos.toByteArray();
        return Base64.getEncoder().encodeToString(bytes);
    }



    private boolean validateNightStayFields(BusinessTripForm form) {
        return !FieldValidator.validateDigitField(form.getNightStayPrice()) ||
                !FieldValidator.validateDayField(form.getNumberOfNightsStayed()) ||
                !FieldValidator.validateDayField(String.valueOf(form.getFromWhichDayField())) ||
                !FieldValidator.validateDayField(String.valueOf(form.getToWhichDayField()));
    }

    private boolean validateVehicleFields(BusinessTripForm form) {
        return !FieldValidator.validateDigitField(form.getCostBy100()) ||
                !FieldValidator.validateDigitField(form.getFuelPrice()) ||
                !FieldValidator.validateDigitField(form.getKilometers());
    }

    private boolean validateCommonFields(BusinessTripForm form) {
        return !FieldValidator.validateDigitField(String.valueOf(form.getNumberDocuments())) ||
                !FieldValidator.validateDayField(String.valueOf(form.getNumberOfDays())) ||
                !FieldValidator.validateMonthField(form.getMonthNumber()) ||
                !FieldValidator.validateYearField(form.getWhatYear()) ||
                !FieldValidator.validateDigitField(form.getTripNumberThisMonth()) ||
                !FieldValidator.validateDigitField(form.getAdditionalExpenses());
    }


}
