package com.pd.algorithms;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfCharacters {

  // in this algorithm we are trying to find number of occurences of every
  // character in a string, efficiently

  public HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
  private String s;

  public OccurrencesOfCharacters(String s) {
    this.s = s;
    char[] str = s.toCharArray();
    for (char c : str) {
      if (hm.containsKey(c)) {
        hm.put(c, hm.get(c) + 1);
      } else {
        hm.put(c, 1);
      }
    }
  }

  public int findNumOccurencesOfCharacter(char character) {
    if (hm.get(character) != null) {
      return hm.get(character);
    } else {
      return 0;
    }
  }

  public void findNumOccurencesOfAllCharacters() {
    for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
      System.out.println("Character " + entry.getKey() + " has occured " + entry.getValue() + " times");
    }
  }
}
