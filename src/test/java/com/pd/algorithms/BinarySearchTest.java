package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  @Test
  @DisplayName("Regular binary search should work")
  void binarySearch() {

    int[] arr = {1, 4, 6, 2, 9};
    BinarySearch bs = new BinarySearch(arr);

    assertTrue(bs.search(2));
    assertFalse(bs.search(3));

  }

  @Test
  @DisplayName("Binary search with duplicates should work")
  void binarySearchWithDuplicates() {

    int[] arr = {1, 4, 6, 1, 2, 9};
    BinarySearch bs = new BinarySearch(arr);

    assertTrue(bs.search(1));
    assertFalse(bs.search(3));

  }

  @Test
  @DisplayName("Binary search with empty array should work")
  void binarySearchWithEmptyArray() {

    int[] arr = {};
    BinarySearch bs = new BinarySearch(arr);

    assertFalse(bs.search(1));

  }


}
