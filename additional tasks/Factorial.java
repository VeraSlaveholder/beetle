package a1;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(10));
    }

    public static BigInteger fac(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        } else {
            return fac(n - 1).multiply(BigInteger.valueOf(n));
        }
    }
}
