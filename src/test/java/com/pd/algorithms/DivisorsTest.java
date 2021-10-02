package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class DivisorsTest {
    
    @Test
    @DisplayName("1 has only single divisor")
    void checkDivisorsFor1() {
        Divisors div = new Divisors();
        List<Integer> expected = Arrays.asList(1);
        assertEquals(div.findDivisors(1), expected);
    }

    @Test
    @DisplayName("2 has only 2 divisors")
    void checkDivisorsFor2() {
        Divisors div = new Divisors();
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(div.findDivisors(2), expected);
    }
  
    @Test
    @DisplayName("24 has 1, 2, 3, 4, 6, 8, 12, and 24 divisors")
    void checkDivisorsFor24() {
        Divisors div = new Divisors();
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 6, 8, 12, 24);
        assertEquals(div.findDivisors(24), expected);
    }
}
