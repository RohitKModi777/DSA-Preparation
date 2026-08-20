/*
 * Problem Title: Maximum Subarray Sum (Brute Force Approach)
 * Role / Category: Array / Dynamic Programming Concept
 * Student Notes:
 *   - Subarray: A contiguous part of an array.
 *   - Goal: Find the contiguous subarray with the maximum possible sum.
 *   - Note: Optimal solution is Kadane's Algorithm O(N).
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */

public class maxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int res = arr[0]; // Stores maximum subarray sum found so far

        // Outer loop fixes the starting element of the subarray
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            // Inner loop extends the subarray to index j and accumulates sum
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
                // Update result if current subarray sum is greater
                res = Math.max(res, currSum);
            }
        }
        System.out.println("Maximum Subarray Sum: " + res);
    }
}
