package com.junittests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleMathTestS4 {
  SimpleMath sm;

  @BeforeEach
  void beforeEachMethod() {
    sm = new SimpleMath();
  }

  @DisplayName("Test division parameterized")
  @ParameterizedTest
  //  @MethodSource("testDivisionInputParameters")
  @MethodSource
  void testDivision(double firstNumber, double secondNumber, double expected) {

    Double result = sm.division(firstNumber, secondNumber);

    assertNotNull(result);

    assertEquals(
        expected,
        result,
        // decimals
        2D,
        () ->
            String.format(
                "%s / %s did not " + "produce %s",
                firstNumber, secondNumber, expected));
  }

  public static Stream<Arguments> testDivision() {
    return Stream.of(
        Arguments.of(6.2D, 2D, 3.1D),
        Arguments.of(71D, 14D, 5.07D),
        Arguments.of(18.3D, 3.1D, 5.90D));
  }

  public static Stream<Arguments> testDivisionInputParameters() {
    return Stream.of(
        Arguments.of(6.2D, 2D, 3.1D),
        Arguments.of(71D, 14D, 5.07D),
        Arguments.of(18.3D, 3.1D, 5.90D));
  }

  @ParameterizedTest
  @ValueSource(strings = {"Pele", "Senna"})
  void testValueSource(String firstName) {
    System.out.println(firstName);
    assertNotNull(firstName);
  }
}
