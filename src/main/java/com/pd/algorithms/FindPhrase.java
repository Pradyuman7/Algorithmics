package com.pd.algorithms;

public class FindPhrase {

  public int timesFound(String string, String phrase) {
    int count = 0, fromIndex = 0;
        
    while ((fromIndex = string.indexOf(phrase, fromIndex)) != -1) {
      count++;
      fromIndex++;
    }

    return count;
  }
}
