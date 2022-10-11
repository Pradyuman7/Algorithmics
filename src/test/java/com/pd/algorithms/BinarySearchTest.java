package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  @Test
  @DisplayName("Regular binary search")
  void binarySearch() {

    int[] arr = { 1, 4, 6, -2, 9 };
    BinarySearch bs = new BinarySearch(arr);

    assertTrue(bs.search(-2));
    assertTrue(bs.search(1));
    assertTrue(bs.search(4));
    assertTrue(bs.search(6));
    assertTrue(bs.search(9));

    assertFalse(bs.search(-3));
    assertFalse(bs.search(-1));
    assertFalse(bs.search(0));
    assertFalse(bs.search(2));
    assertFalse(bs.search(3));
    assertFalse(bs.search(5));
    assertFalse(bs.search(7));
    assertFalse(bs.search(8));
    assertFalse(bs.search(10));

  }

  @Test
  @DisplayName("Binary search with duplicates")
  void binarySearchWithDuplicates() {

    int[] arr = { 1, 4, -3, 6, 1, 2, 9, -3, -3 };
    BinarySearch bs = new BinarySearch(arr);

    assertTrue(bs.search(-3));
    assertTrue(bs.search(1));

  }

  @Test
  @DisplayName("Binary search with empty array")
  void binarySearchWithEmptyArray() {

    int[] arr = {};
    BinarySearch bs = new BinarySearch(arr);

    assertFalse(bs.search(0));
    assertFalse(bs.search(1));

  }

  @Test
  @DisplayName("Binary search with an array of zero")
  void binarySearchWitArrayOfZero() {

    int[] arr = {0};
    BinarySearch bs = new BinarySearch(arr);

    assertTrue(bs.search(0));
    assertFalse(bs.search(1));

  }

}
