package com.junittests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
