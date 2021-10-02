package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    
    @Test
    @DisplayName("1 is neither prime nor composite")
    void checkPrimeFor1() {
        CheckPrime cp = new CheckPrime();
        assertFalse(cp.checkPrime(1));
    }

    @Test
    @DisplayName("2 is only even prime")
    void binarySearchWithDuplicates() {
        CheckPrime cp = new CheckPrime();
        assertTrue(cp.checkPrime(2));
    }

    @Test
    @DisplayName("5 is prime")
    void binarySearchWithEmptyArray() {
        CheckPrime cp = new CheckPrime();
        assertTrue(cp.checkPrime(5));
    }
  
    @Test
    @DisplayName("6 is not prime")
    void binarySearchWithEmptyArray() {
        CheckPrime cp = new CheckPrime();
        assertFalse(cp.checkPrime(6));
    }

    @Test
    @DisplayName("9 is not prime")
    void binarySearchWithEmptyArray() {
        CheckPrime cp = new CheckPrime();
        assertFalse(cp.checkPrime(9));
    }
  
    @Test
    @DisplayName("127 is prime")
    void binarySearchWithEmptyArray() {
        CheckPrime cp = new CheckPrime();
        assertTrue(cp.checkPrime(127));
    }
}
