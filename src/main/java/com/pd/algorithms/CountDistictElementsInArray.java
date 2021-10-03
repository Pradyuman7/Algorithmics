package com.pd.algorithms;

import java.util.*;

public class CountDistinctElementsInArray {

    public int countDistict( int arr[])
    {
          HashSet<Integer> h= new HashSet<>();

          for(int i=0;i<arr.length;i++)
          {

              h.add(arr[i]);  //If an element is already present in hashset, it won't add it again
              
          }

          return h.size();   // as hashset does not contain duplicate elements, size of hashset will give the number of distinct elements

    }
    
}