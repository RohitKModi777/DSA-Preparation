/*
 * Problem Title: Majority Element
 * Role / Category: Array Data Structure
 * Student Notes:
 *   - A majority element appears more than N/2 times in an array of size N.
 *   - Brute Force Approach: Count occurrences of each element using two loops.
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */

public class majorityelement {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 3};
        int n = arr.length;

        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            int count = 0;
            // Count how many times arr[i] appears in the array
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Check if count exceeds N/2 threshold
            if (count > n / 2) {
                System.out.println("Majority Element: " + arr[i]);
                return;
            }
        }
        System.out.println("No Majority Element found");
    }
}
