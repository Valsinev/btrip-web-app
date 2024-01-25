package stoyanov.venislav.btripweb.controller;
import jakarta.validation.Valid;
import org.example.engine.TripTypeSelector;
import org.example.utillity.BTripGetDaysFromCheckboxesOrFields;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import stoyanov.venislav.btripweb.model.BTrip;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class BTripController {

    @GetMapping("/")
    public String showTripForm(Model model) {
        model.addAttribute("bTrip", new BTrip());
        return "tripTemplate";
    }

    @PostMapping("/showImages")
    public String submitTrip(@Valid @ModelAttribute("bTrip") BTrip bTrip, Model model, BindingResult bindingResult) {

        System.out.println(bindingResult.toString());
        //validation of model class fields
        if (bindingResult.hasErrors()) {
            return "tripTemplate";
        }
        //validation if checked days are equal to number of days
        bTrip.setDays(BTripGetDaysFromCheckboxesOrFields.getDays(bTrip));
        if (bTrip.getDays().isEmpty() || Objects.equals(bTrip.getDays().size(), bTrip.getNumberOfDays())) {
            return "tripTemplate";
        } else {
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
    }

    private String convertImageToBase64(BufferedImage image) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        javax.imageio.ImageIO.write(image, "png", baos);
        byte[] bytes = baos.toByteArray();
        return Base64.getEncoder().encodeToString(bytes);
    }



}
