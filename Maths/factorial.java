/*
 * Problem Title: Factorial & Fibonacci Calculation
 * Role / Category: Mathematics & Recursion
 * Student Notes:
 *   - Factorial N! = N * (N-1) * ... * 1. Base cases: 0! = 1, 1! = 1.
 *   - Fibonacci F(N) = F(N-1) + F(N-2). Base cases: F(0) = 0, F(1) = 1.
 *   - Demonstrates Iterative and Recursive solutions.
 * 
 * Time Complexity: 
 *   - Factorial: O(N)
 *   - Fibonacci (Recursive): O(2^N)
 * Space Complexity:
 *   - Iterative: O(1), Recursive Call Stack: O(N)
 */

package Maths;

public class factorial {

    // Recursive Factorial
    public static int facto(int a) {
        if (a == 0 || a == 1) return 1;
        return a * facto(a - 1);
    }

    // Recursive Fibonacci
    public static int fibo(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        return fibo(a - 1) + fibo(a - 2);
    }

    public static void main(String[] args) {
        int num = 5;
        
        // Iterative Factorial calculation
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i; 
        }
        System.out.println("Iterative Factorial of " + num + ": " + fact);
        System.out.println("Recursive Factorial of " + num + ": " + facto(num));
        System.out.println("Fibonacci term at index 5: " + fibo(5));
    }
}
