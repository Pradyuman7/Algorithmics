package com.pd.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.get(nums[i]).add(i);
      } else {
        List<Integer> temp = new ArrayList<>();
        temp.add(i);
        map.put(nums[i], temp);
      }
    }

    for (int i = 0; i < nums.length; i++) {
      int find = target - nums[i];
      List<Integer> temp = map.getOrDefault(find, new ArrayList<>());

      for (int index : temp) {
        if (i != index) {
          return new int[]{i, index};
        }
      }
    }

    return new int[0];
  }
}
