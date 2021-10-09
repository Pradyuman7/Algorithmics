package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountDistinctElementsTest {

    @Test
    @DisplayName("should return number of distinct elements in array")
    void distinct() {

        int[] arr = new int[]{1, 2, 3, 4, 2, 3,1,5};
          
      
        CountDistinctElements cd= new CountDistinctElements(arr);
        assertEquals(cd.countDistinct(), 5);
    
}
   
@Test
@DisplayName("should return consider all duplicates as one")
void identical() {

    int[] arr = new int[]{2,2,2,2,2};
      
  
    CountDistinctElements cd= new CountDistinctElements(arr);
    assertEquals(cd.countDistinct(), 1);

}
}
