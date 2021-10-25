package com.pd.algorithms;

public class MaxSubArraySum {

  // Kadane's Algoithm

  private int[] arr;

  public MaxSubArraySum(int[] arr) {
    this.arr = arr;

  }

  public int getSum() {

    int size = arr.length;
    int max_so_far = arr[0];

    int curr_max = arr[0];

    for (int i = 1; i < size; i++) {
      curr_max = Math.max(arr[i], curr_max + arr[i]);
      max_so_far = Math.max(max_so_far, curr_max);
    }

    return max_so_far;

  }

}
