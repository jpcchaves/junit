package com.junittests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.*;

@Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ArraysCompareTest {

  @DisplayName("Sort array test")
  @Test
  void testArraySort_When_SortingIt_ShouldReturnSortedArray() {
    // Given // Arrange
    int[] numbers = {25, 8, 21, 32, 3};
    int[] expectedArr = {3, 8, 21, 25, 32};

    // When / Act
    Arrays.sort(numbers);

    // Then /Assert
    assertArrayEquals(numbers, expectedArr);
  }

  @DisplayName("Test performance when sorting array or throw timeout")
  @Test
  @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
  @Disabled(
      "It was disabled to avoid slow execution, enable it to test the "
          + "timeout exception")
  void
      testSortPerformance_When_SortingIt_ShouldHaveGoodPerformanceOrWillThrowTimeout() {
    // Given / Arrange
    int[] numbers = {25, 8, 21, 32, 3};

    // When / Act
    for (int i = 0; i < 1000000000; i++) {
      numbers[0] = i;
      Arrays.sort(numbers);
    }
  }
}
