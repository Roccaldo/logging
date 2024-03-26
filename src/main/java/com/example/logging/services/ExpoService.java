package com.example.logging.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExpoService {
    private static final Logger logger = LoggerFactory.getLogger(ExpoService.class);

    @Value("${FirstVariable}")
    private double firstVariable;
    @Value("${SecondVariable}")
    private double secondVariable;

    /**
     * calculate power exponent of two numbers
     * @return the exponent
     */
    public double expo() {
        logger.info("Starting calculation for base: {} and exponent: {}", firstVariable, secondVariable);
        double pow = Math.pow(firstVariable, secondVariable);
        logger.info("Calculation finished. Result: {}", pow);
        return pow;
    }

}
