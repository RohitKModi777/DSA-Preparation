/*
 * Problem Title: Two Sum Problem
 * Role / Category: Array / Searching
 * Student Notes:
 *   - Goal: Determine if there exist two elements whose sum equals target.
 *   - Brute Force Approach: Check all pairs (i, j) where i != j.
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 3, 1};
        int target = -1;

        // Check each pair of elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: true");
                    return;
                }
            }
        }
        System.out.println("Pair found: false");
    }
}
