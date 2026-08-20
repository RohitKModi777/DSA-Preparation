/*
 * Problem Title: Find Missing Number in Array
 * Role / Category: Array & Mathematics
 * Student Notes:
 *   - Goal: Find the missing integer in range 1 to N+1 from an array of size N.
 *   - Mathematical Formula: Sum of first N natural numbers = N * (N + 1) / 2.
 *   - Missing Number = Expected Sum - Sum of array elements.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1}; // Size 7, range 1..8
        
        long n = arr.length + 1; // Expected element count including missing number
        long sum = 0;

        // Calculate actual sum of elements present in array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Expected sum of first 'n' natural numbers
        long expSum = n * (n + 1) / 2;

        System.out.println("Missing Number: " + (int)(expSum - sum));
    }
}
