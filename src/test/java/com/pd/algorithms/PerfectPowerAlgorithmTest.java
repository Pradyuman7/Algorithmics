package com.pd.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PerfectPowerAlgorithmTest {

    private PerfectPowerAlgorithm perfectPowerAlgorithm;

    @BeforeEach
    public void setUp() {
        this.perfectPowerAlgorithm = new PerfectPowerAlgorithm();
    }

    @Test
    @DisplayName("0 is not a perfect number")
    public void test0() {
        assertNull(perfectPowerAlgorithm.isPerfectPower(0));
    }

    @Test
    @DisplayName("0 is not a perfect number")
    public void test1() {
        assertNull(perfectPowerAlgorithm.isPerfectPower(1));
    }

    @Test
    @DisplayName("0 is not a perfect number")
    public void test2() {
        assertNull(perfectPowerAlgorithm.isPerfectPower(2));
    }

    @Test
    @DisplayName("0 is not a perfect number")
    public void test3() {
        assertNull(perfectPowerAlgorithm.isPerfectPower(3));
    }

    @Test
    @DisplayName("4 = 2^2")
    public void test4() {
        assertArrayEquals(new int[]{2,2}, perfectPowerAlgorithm.isPerfectPower(4));
    }

    @Test
    @DisplayName("5 is not a perfect power")
    public void test5() {
        assertNull(perfectPowerAlgorithm.isPerfectPower(5));
    }

    @Test
    @DisplayName("8 = 2^3")
    public void test8() {
        assertArrayEquals(new int[]{2,3}, perfectPowerAlgorithm.isPerfectPower(8));
    }

    @Test
    @DisplayName("9 = 3^2")
    public void test9() {
        assertArrayEquals(new int[]{3,2}, perfectPowerAlgorithm.isPerfectPower(9));
    }

    @Test
    @DisplayName("n is a perfect number")
    public void testUpTo500() {
        int[] pp = {4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484};
        for (int i: pp) assertNotNull(perfectPowerAlgorithm.isPerfectPower(i));
    }

}
