package com.pd.algorithms;

import java.util.Arrays;

public class BinarySearch {

  public int[] array;
  public int size;

  public BinarySearch(int[] array) {
    Arrays.sort(array);
    this.array = array;
    this.size = array.length;
  }

  public boolean search(int number) {
    return binarySearch(0, size - 1, number);
  }

  private boolean binarySearch(int low, int high, int number) {
    while (low <= high) {
      int middle = (high + low) / 2;

      if (array[middle] == number) {
        return true;
      }

      if (array[middle] > number) {
        return binarySearch(low, middle - 1, number); // discard the end of the array
      }

      return binarySearch(middle + 1, high, number); // discard the beginning of the array
    }

    return false;
  }
}
