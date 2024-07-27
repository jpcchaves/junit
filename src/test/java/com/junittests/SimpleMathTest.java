package com.junittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class SimpleMathTest {
  SimpleMath sm;

  // Test naming pattern
  // test[System Under Test]_[Condition or State Change]-[Expected Result]

  // Test patterns
  // AAA => Arrange, Act, Assert
  /// Given, When, Then

  @BeforeAll
  static void setup() {
    System.out.println("Before all");
  }

  @AfterAll
  static void cleanup() {
    System.out.println("After all");
  }

  @BeforeEach
  void beforeEachMethod() {
    sm = new SimpleMath();
  }

  @AfterEach
  void afterEachMethod() {
    System.out.println("After each method");
  }

  @Test
  void testSum_WhenSixDotDotIsAddedByTwo_ShouldReturnEightDotTwo() {
    // Give
    double firstNumber = 6.2D;
    double secondNumber = 2D;

    Double expected = 8.2D;
    Double unexpected = 9.2D;

    // When
    Double result = sm.sum(firstNumber, secondNumber);

    // Then
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
  @Disabled("Todo: still needs implementation")
  void
      testDivision_When_FirstNumberIsDividedByZero_ShouldReturnArithmeticException() {
    fail();
  }

  @Test
  void testDivision() {

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
