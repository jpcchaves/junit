package com.junittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

  // Test naming pattern
  // test[System Under Test]_[Condition or State Change]-[Expected Result]

  @Test
  void testSum_WhenSixDotDotIsAddedByTwo_ShouldReturnEightDotTwo() {
    SimpleMath sm = new SimpleMath();

    double firstNumber = 6.2D;
    double secondNumber = 2D;

    Double result = sm.sum(firstNumber, secondNumber);

    Double expected = 8.2D;
    Double unexpected = 9.2D;

    assertEquals(
        expected,
        result,
        () ->
            String.format(
                "%s + %s did not produce %s!",
                firstNumber, secondNumber, result));

    assertNotEquals(unexpected, result);

    assertNotNull(result);
  }

  @Test
  void testSubtraction() {

    SimpleMath sm = new SimpleMath();

    double firstNumber = 6.2D;

    double secondNumber = 2D;

    Double result = sm.subtraction(firstNumber, secondNumber);

    Double expected = 4.2D;
    Double unexpected = 9.2D;

    assertNotNull(result);

    assertEquals(
        expected,
        result,
        () ->
            String.format(
                "%s - %s did not produce %s!",
                firstNumber, secondNumber, expected));

    assertNotEquals(unexpected, result);
  }

  @Test
  void testMultiplication() {

    SimpleMath sm = new SimpleMath();

    double firstNumber = 6.2D;
    double secondNumber = 2D;

    Double result = sm.multiplication(firstNumber, secondNumber);

    Double expected = 12.4D;

    Double unexpected = 9.2D;

    assertNotNull(result);

    assertEquals(
        expected,
        result,
        () ->
            String.format(
                "%s * %s did not " + "produce %s!",
                firstNumber, secondNumber, expected));

    assertNotEquals(unexpected, result);
  }

  @Test
  @DisplayName(
      "Test division when first number is divided by zero should return"
          + " ArithmeticException")
  void
      testDivision_When_FirstNumberIsDividedByZero_ShouldReturnArithmeticException() {
    fail();
  }

  @Test
  void testDivision() {

    SimpleMath sm = new SimpleMath();

    double firstNumber = 6.2D;
    double secondNumber = 2D;

    Double result = sm.division(firstNumber, secondNumber);

    Double expected = 3.1D;

    Double unexpected = 9.2D;

    assertNotNull(result);

    assertEquals(
        expected,
        result,
        () ->
            String.format(
                "%s / %s did not " + "produce %s",
                firstNumber, secondNumber, expected));

    assertNotEquals(unexpected, result);
  }

  @Test
  void testMean() {

    SimpleMath sm = new SimpleMath();

    double firstNumber = 6.2D;
    double secondNumber = 2D;

    Double result = sm.mean(firstNumber, secondNumber);

    Double expected = 4.1D;

    Double unexpected = 9.2D;

    assertNotNull(result);

    assertEquals(
        expected,
        result,
        String.format("The mean did not produce %s", expected));

    assertNotEquals(unexpected, result);
  }

  @Test
  void testSquareRoot() {

    SimpleMath sm = new SimpleMath();

    double firstNumber = 16.0D;

    double expected = 4.0D;
    double unexpected = 12.0D;

    Double result = sm.squareRoot(firstNumber);

    assertNotNull(result);

    assertEquals(
        expected,
        result,
        () -> String.format("The square root did not produce %s", expected));

    assertNotEquals(unexpected, result);
  }
}
