package stoyanov.venislav.btripweb.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Provide your custom error handling logic or return a specific error view
        return "errorTemplate"; // You can create an "error.html" template in your templates folder
    }

}