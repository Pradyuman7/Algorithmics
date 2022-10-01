package com.pd.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test
    @DisplayName("two sum valid")
    void validTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2,7,11,15}, 9);
        assertArrayEquals(result, new int[]{0,1});
    }

    @Test
    @DisplayName("two sum invalid")
    void invalidTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{2,7,11,15}, 90);
        assertArrayEquals(result, new int[]{});
    }
}
