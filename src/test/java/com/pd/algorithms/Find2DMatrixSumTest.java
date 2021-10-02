package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Find2DMatrixSumTest {
    
    @Test
    @DisplayName("0 matrix should have sum 0")
    void zeroMatrixSum() {

        int[][] arr = new int[][]{
          {0,0,0},
          {0,0,0},
          {0,0,0}
        };
      
        Find2DMatrixSum mSum = new Find2DMatrixSum(arr);
        assertEquals(mSum.findSumOfMatrix(), 0);
    }

    @Test
    @DisplayName("simple matrix should have correct sum")
    void simpleMatrixSum() {

        int[][] arr = new int[][]{
          {1,2,3},
          {4,5,6},
          {7,8,9}
        };
      
        Find2DMatrixSum mSum = new Find2DMatrixSum(arr);
        assertEquals(mSum.findSumOfMatrix(), 35);
    }
  
    @Test
    @DisplayName("long matrix should have correct sum")
    void longMatrixSum() {

        int[][] arr = new int[][]{
          {Integer.MAX_VALUE, Integer.MAX_VALUE},
          {Integer.MAX_VALUE, Integer.MAX_VALUE}
        };
      
        Find2DMatrixSum mSum = new Find2DMatrixSum(arr);
        assertEquals(mSum.findLongSumOfMatrix(), 8589934588);
    }
}
