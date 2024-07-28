package com.junittests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

public class DemoRepeatedTest {
  private SimpleMath sm;

  @BeforeEach
  void beforeEachMethod() {
    sm = new SimpleMath();
  }

  @RepeatedTest(
      value = 3,
      name =
          "{displayName}. Repetition "
              + "{currentRepetition} of {totalRepetitions}")
  @DisplayName(
      "Test division when first number is divided by zero should return"
          + " ArithmeticException")
  void
      testDivision_When_FirstNumberIsDividedByZero_ShouldReturnArithmeticException(
          RepetitionInfo repetitionInfo, TestInfo testInfo) {

    System.out.println(
        "Repetition No "
            + repetitionInfo.getCurrentRepetition()
            + "/"
            + repetitionInfo.getCurrentRepetition());

    System.out.printf(
        "Test info: Test class: %s. Display name:  %s",
        testInfo.getTestClass(), testInfo.getDisplayName());

    // Given
    double firstNumber = 6.2D;
    double secondNumber = 0D;

    String expectedExMessage = "Impossible to divide by zero";

    ArithmeticException actual =
        assertThrows(
            ArithmeticException.class,
            // when & then
            () -> sm.division(firstNumber, secondNumber),
            () -> "Divided by zero should throw ArithmeticException");

    assertEquals(
        expectedExMessage,
        actual.getMessage(),
        () -> "Unexpected Arithmetic Exception message");
  }
}
