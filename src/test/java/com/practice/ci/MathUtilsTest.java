package com.practice.ci;

import java.nio.file.Path;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    @DisplayName("Kiểm tra phép cộng")
    void testAdd() {
        Assertions.assertEquals(30, mathUtils.add(10, 20));
    }

    @Test
    @DisplayName("Kiểm tra phép trừ")
    void testSubtract() {
        Assertions.assertEquals(5, mathUtils.subtract(15, 10));
    }

    @Test
    @DisplayName("Kiểm tra phép nhân")
    void testMultiply() {
        Assertions.assertEquals(50, mathUtils.multiply(5, 10));
    }

    @Test
    @DisplayName("Kiểm tra phép chia hợp lệ")
    void testDivideSuccess() {
        Assertions.assertEquals(5, mathUtils.divide(20, 4));
    }

    @Test
    @DisplayName("Kiểm tra ngoại lệ chia cho 0")
    void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.divide(10, 0);
        });
    }

    @Test
    @DisplayName("Kiểm tra xây dựng đường dẫn độc lập nền tảng")
    void testBuildFilePath() {
        String expected = Path.of("data", "output.csv").toString();
        String actual = mathUtils.buildFilePath("data", "output.csv");
        Assertions.assertEquals(expected, actual);
    }
}