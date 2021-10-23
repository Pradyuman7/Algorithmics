package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SievePrimesAlgorithmTest {

  @Test
  void testPrimeLessThan10() {
    SievePrimesAlgorithm sp = new SievePrimesAlgorithm();
    sp.start();

    assertTrue(sp.isPrime(2));
    assertTrue(sp.isPrime(3));
    assertTrue(sp.isPrime(5));
    assertTrue(sp.isPrime(7));
  }

  @Test
  void testNoPrimeLessThan10() {
    SievePrimesAlgorithm sp = new SievePrimesAlgorithm();
    sp.start();

    assertFalse(sp.isPrime(1));
    assertFalse(sp.isPrime(4));
    assertFalse(sp.isPrime(6));
    assertFalse(sp.isPrime(9));
  }

  @Test
  void testLargePrimesAndComposites() {
    SievePrimesAlgorithm sp = new SievePrimesAlgorithm();
    sp.start();

    assertTrue(sp.isPrime(7853));
    assertTrue(sp.isPrime(7919));
    assertFalse(sp.isPrime(83478));
  }

}
