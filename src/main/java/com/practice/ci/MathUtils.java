package com.practice.ci;

import java.nio.file.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        logger.info("Executing add: {} + {}", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        logger.info("Executing subtract: {} - {}", a, b);
        return a - b;
    }

    public int multiply(int a, int b) {
        logger.info("Executing multiply: {} * {}", a, b);
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            logger.error("Divide by zero attempt: {} / {}", a, b);
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        logger.info("Executing divide: {} / {}", a, b);
        return a / b;
    }

    public String buildFilePath(String directory, String fileName) {
        Path path = Path.of(directory, fileName);
        logger.info("Constructed platform-independent path: {}", path);
        return path.toString();
    }
}