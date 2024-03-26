package com.example.logging.controllers;

import com.example.logging.services.ExpoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    @Autowired
    private ExpoService service;

    /**
     *  a method to return a welcome message with a log info
     * @return the welcome message as a string
     */
    @GetMapping("/welcome")
    public String hello() {
        logger.info("this is an info logger");
        return "Welcome to my website";
    }

    /**
     * a method to return the power exponent of two numbers
     * @return the power exponent
     */
    @GetMapping("/expo")
    public double expo() {
        return service.expo();
    }

    /**
     * a method to return an error message with a log error
     */
    @GetMapping("/errors")
    public void errors() {
        Exception e = new RuntimeException("CUSTOM ERROR");
        logger.error("this is an error logger", e);
    }
}
