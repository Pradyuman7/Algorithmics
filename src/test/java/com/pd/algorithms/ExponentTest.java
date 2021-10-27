package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExponentTest {

  @Test
  @DisplayName("1 has all powers as 1")
  void checkExponentFor1() {
    Exponent exp = new Exponent();
    assertEquals(exp.pow(1, 141), 1);
  }

  @Test
  @DisplayName("2 raised to 1 is 2")
  void checkExponentFor2() {
    Exponent exp = new Exponent();
    assertEquals(exp.pow(2, 1), 2);
  }

  @Test
  @DisplayName("9 raised to 0 is 1")
  void checkExponentFor9() {
    Exponent exp = new Exponent();
    assertEquals(exp.pow(9, 0), 1);
  }

  @Test
  @DisplayName("12 raised to 8 is 429981696")
  void checkExponentFor12() {
    Exponent exp = new Exponent();
    assertEquals(exp.pow(12, 8), 429981696);
  }

}
