package com.pd.algorithms;

public class FindMaxSubArrayProduct {
  private int[] nums;

  public FindMaxSubArrayProduct(int[] arr) {
    this.nums = arr;
  }

  public int findMaxProduct() {
    if (nums.length == 0) {
        return 0;
    }
        
    int max = Integer.MIN_VALUE, product = 1;
        
    for (int i = 0; i < nums.length; i++) {
        product *= nums[i];
        max = Math.max(product, max);
            
        if (nums[i] == 0) {
            product = 1;
        }
    }

    product = 1;
        
    for (int i = nums.length - 1; i >= 0; i--) {
        product *= nums[i];
        max = Math.max(product, max);
        if (nums[i] == 0) {
            product = 1;
        }
    }

    return max;
  }
}
