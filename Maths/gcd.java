package Maths;

import java.math.BigInteger;

public class gcd {
    public static void main(String[] args) {
        int a =20,b=28;
        int gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
        System.out.println(gcd);
    }
}
