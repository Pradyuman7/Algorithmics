package com.pd.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FindMaxSubarrayProductTest {

  @Test
  @DisplayName("Test 1")
  void maxProduct1() {
    // given
    int[] testArray = new int[]{2,3,-2,4};
    FindMaxSubarrayProduct maxProduct = new FindMaxSubarrayProduct(testArray);

    // when
    int result = maxProduct.findMaxProduct();

    // then
    Assertions.assertEquals(6, result);
  }

  @Test
  @DisplayName("Test 2")
  void maxProduct2() {
    // given
    int[] testArray = new int[]{-2,0,-1};
    FindMaxSubarrayProduct maxProduct = new FindMaxSubarrayProduct(testArray);

    // when
    int result = maxProduct.findMaxProduct();

    // then
    Assertions.assertEquals(0, result);
  }
}
