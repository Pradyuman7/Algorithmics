package com.pd.algorithms;

import java.util.Arrays;

public class BinarySearch {

  public int[] arr;
  public int size;

  public BinarySearch(int[] arr) {
    Arrays.sort(arr);
    this.arr = arr;
    this.size = arr.length;
  }

  public boolean search(int num) {
    return binarySearch(arr, 0, size - 1, num);
  }

  public boolean binarySearch(int[] array, int low, int high, int value) {
    while (low <= high) {
      int mid = (high + low) / 2;
      if (array[mid] == value) {
        return true;
      }

      if (array[mid] > value) {
        high = mid - 1; // discard the end of the array
      } else {
        low = mid + 1; // discard the beginning of the array
      }
    }
    return false;
  }
}
