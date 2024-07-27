package com.junittests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
                "%s - %s did dskjahfkhdaskfhsdakjfhkjasdhkjfhd not produce %s!",
                firstNumber, secondNumber, result));

    assertNotEquals(unexpected, result);
  }
}
