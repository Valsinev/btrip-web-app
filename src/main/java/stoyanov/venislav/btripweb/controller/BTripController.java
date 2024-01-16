package stoyanov.venislav.btripweb.controller;

import org.example.engine.TripTypeSelector;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import stoyanov.venislav.btripweb.model.BTrip;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BTripController {

    @GetMapping("/")
    public String showTripForm(Model model) {
        model.addAttribute("bTrip", new BTrip());
        return "tripTemplate";
    }

    @PostMapping("/showImages")
    public String submitTrip(@ModelAttribute BTrip bTrip) {
        List<BufferedImage> sheets = new ArrayList<>();
        TripTypeSelector.select(bTrip, sheets);

        System.out.println(bTrip);

        //pass the sheets to processTripTemplate, to be looped and displayed to the user
        return "processedTripTemplate";
    }


}
