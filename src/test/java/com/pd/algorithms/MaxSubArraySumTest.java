package com.pd.algorithms;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MaxSubArraySumTest {

  @Test
  @DisplayName("Should find max sum of negative numbers")
  void shouldFindMaxSumOfNegativeNumbers() {
    // given
    final var testArray = new int[]{-1, -2, -3, -4, -5};
    final var maxSubArraySum = new MaxSubArraySum(testArray);

    // when
    final var result = maxSubArraySum.getSum();

    // then
    Assertions.assertEquals(-1, result);
  }

  @Test
  @DisplayName("Should find max sum of negative numbers")
  void shouldFindMaxSumOfPositiveNumbers() {
    // given
    final var testArray = new int[]{1, 2, 3, 4, 5};
    final var maxSubArraySum = new MaxSubArraySum(testArray);

    // when
    final var result = maxSubArraySum.getSum();

    // then
    Assertions.assertEquals(15, result);
  }

  @Test
  @DisplayName("Should find max sum of zeroes")
  void shouldFindMaxSumOfZeroes() {
    // given
    final var testArray = new int[]{0, 0, 0, 0, 0};
    final var maxSubArraySum = new MaxSubArraySum(testArray);

    // when
    final var result = maxSubArraySum.getSum();

    // then
    Assertions.assertEquals(0, result);
  }

}