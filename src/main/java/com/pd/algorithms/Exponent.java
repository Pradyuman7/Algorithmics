package com.pd.algorithms;
/**
 * This class offers some static methods, offering ways to calculate the n'th power of a number.
 * 
 * @author Juri Dispan
 *
 */
public class Exponent {

    /**
     * Exponent modulus some value, O(1).
     * 
     * @param base The base.
     * @param exp The exponent.
     * @param mod The modulus.
     * @return (base^exp) % mod
     */
    public static int modExp(int base, int exp, int mod) {
        long d = 1;
        for (int i = 31; i >= 0; i--) {
            d = (d * d) % mod;
            if (((1 << i) & exp) != 0) {
                d = (d * base) % mod;
            }
        }
        return (int) d;
    }

    /**
     * Calculates the exp'th power of base.
     * 
     * @param base The base.
     * @param exp The exponent.
     * @return base^exp
     */
    public static int pow(int base, int exp) {
        int res = 1;
        while (exp-- > 0) {
            res *= base;
        }
        return res;
    }

    /**
     * Calculates the exp'th power of base.
     * 
     * @param base The base.
     * @param exp The exponent.
     * @return base^exp
     */
    public static long pow(long base, long exp) {
        long res = 1;
        while (exp-- > 0) {
            res *= base;
        }
        return res;
    }

}
