package com.junittests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleMathTest {

    @Test
    void testSum() {
        SimpleMath sm = new SimpleMath();

        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double result = sm.sum(firstNumber, secondNumber);


        Double expected = 8.2D;
        Double unexpected = 9.2D;

        assertEquals(
                expected,
                result,
                () -> String.format("%s + %s did not produce %s!", firstNumber, secondNumber, result)
        );

        assertNotEquals(unexpected, result);

        assertNotNull(result);
    }
}
