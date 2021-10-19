package com.pd.algorithms;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectPowerAlgorithmTest {


    @Test
    @DisplayName("0 is not a perfect number")
    public void test0() {
        assertNull(PerfectPowerAlgorithm.isPerfectPower(0));
    }

    @Test
    @DisplayName("0 is not a perfect number")
    public void test1() {
        assertNull(PerfectPowerAlgorithm.isPerfectPower(1));
    }

    @Test
    @DisplayName("0 is not a perfect number")
    public void test2() {
        assertNull(PerfectPowerAlgorithm.isPerfectPower(2));
    }

    @Test
    @DisplayName("0 is not a perfect number")
    public void test3() {
        assertNull(PerfectPowerAlgorithm.isPerfectPower(3));
    }

    @Test
    @DisplayName("4 = 2^2")
    public void test4() {
        assertArrayEquals(new int[]{2,2}, PerfectPowerAlgorithm.isPerfectPower(4));
    }

    @Test
    @DisplayName("5 is not a perfect power")
    public void test5() {
        assertNull(PerfectPowerAlgorithm.isPerfectPower(5));
    }

    @Test
    @DisplayName("8 = 2^3")
    public void test8() {
        assertArrayEquals(new int[]{2,3}, PerfectPowerAlgorithm.isPerfectPower(8));
    }

    @Test
    @DisplayName("9 = 3^2")
    public void test9() {
        assertArrayEquals(new int[]{3,2}, PerfectPowerAlgorithm.isPerfectPower(9));
    }

    @Test
    @DisplayName("n is a perfect number")
    public void testUpTo500() {
        int[] pp = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484};
        for (int i: pp) assertNotNull(PerfectPowerAlgorithm.isPerfectPower(i));
    }

}
