package stoyanov.venislav.btripweb.controller;

import org.example.engine.TripTypeSelector;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import stoyanov.venislav.btripweb.model.BTrip;
import stoyanov.venislav.btripweb.utill.ValidationException;
import stoyanov.venislav.btripweb.utill.Validator;

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
//        try {
//            Validator.validateTrip(bTrip);
//        } catch (ValidationException ex) {
//            // Handle validation exception
//            model.addAttribute("exceptionMessage", ex.getMessage());
//            model.addAttribute("stackTrace", ex.getStackTrace());
//            return "errorTemplate";
//        } catch (Exception e) {
//            model.addAttribute("exceptionMessage", e.getMessage());
//            model.addAttribute("stackTrace", e.getStackTrace());
//            return "errorTemplate";
//        }

        List<BufferedImage> imageList = new ArrayList<>();
        TripTypeSelector.select(bTrip, imageList);

        List<String> base64ImageList = imageList.stream()
                .map(this::convertImageToBase64)
                .collect(Collectors.toList());

        model.addAttribute("base64ImageList", base64ImageList);

        return "processedTripTemplate";
    }


    private String convertImageToBase64(BufferedImage image) {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            javax.imageio.ImageIO.write(image, "png", baos);
            byte[] bytes = baos.toByteArray();
            return Base64.getEncoder().encodeToString(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
