package com.pd.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetDivSquareSumTest {
    @Test
    @DisplayName("sum of square of divisors of 0 and 1")
    void divSquareSumFor1And0() {
        GetDivSquareSum gd = new GetDivSquareSum();
        assertEquals(gd.sumDivSquare(1), 1);
        assertEquals(gd.sumDivSquare(0), 0);
    }

    @Test
    @DisplayName("sum of suare of divisors of 3")
    void divSquareSumFor3() {
        GetDivSquareSum gd = new GetDivSquareSum();
        assertEquals(gd.sumDivSquare(3), 10);
    }
}
