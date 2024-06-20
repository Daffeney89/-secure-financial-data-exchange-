package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class DataValidationFunction {

    public void handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();
        // Simulate data validation logic
        boolean isValid = input != null && !input.isEmpty();
        logger.log("Validation status: " + isValid);
        // Further handling based on validation
    }
}
