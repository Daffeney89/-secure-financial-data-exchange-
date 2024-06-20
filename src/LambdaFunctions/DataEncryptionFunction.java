package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class DataEncryptionFunction {

    public void handleRequest(String input, Context context) {
        LambdaLogger logger = context.getLogger();
        // Simulate data encryption logic
        String encryptedData = "encrypted_" + input;
        logger.log("Encrypted data: " + encryptedData);
        // Return or store encrypted data
    }
}
