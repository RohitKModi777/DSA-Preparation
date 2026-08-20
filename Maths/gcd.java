/*
 * Problem Title: Greatest Common Divisor (GCD / HCF)
 * Role / Category: Mathematics
 * Student Notes:
 *   - GCD of two integers is the largest positive integer that divides both numbers without a remainder.
 *   - Solution utilizes Java's built-in BigInteger.gcd() based on Euclidean Algorithm.
 * 
 * Time Complexity: O(log(min(A, B)))
 * Space Complexity: O(1)
 */

package Maths;

import java.math.BigInteger;

public class gcd {
    public static void main(String[] args) {
        int a = 20, b = 28;
        
        // Compute GCD using BigInteger built-in Euclidean method
        int gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
        
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
}
