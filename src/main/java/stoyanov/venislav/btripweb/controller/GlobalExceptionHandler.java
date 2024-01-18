package stoyanov.venislav.btripweb.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model) {
        // Add error information to the model
        model.addAttribute("stackTrace", ex.getStackTrace());
        model.addAttribute("exceptionMessage", ex.getMessage());

        // Forward to a custom error view
        return "errorTemplate";
    }

    // Add more @ExceptionHandler methods for specific exception types if needed
}

