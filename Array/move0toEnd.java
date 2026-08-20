/*
 * Problem Title: Move All Zeros to End of Array
 * Role / Category: Array Manipulation
 * Student Notes:
 *   - Goal: Shift all 0s to the end while preserving order of non-zero elements.
 *   - Approach: Use a temporary array to store non-zero elements, then fill remaining with 0.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

public class move0toEnd {
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 0, 4, 5, 6};
        int n = arr.length;
        int temp[] = new int[n];
        int idxtmp = 0;

        // Step 1: Copy non-zero elements into temp array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[idxtmp++] = arr[i];
            }
        }
        
        // Step 2: Fill remaining positions in temp with zeros
        while (idxtmp < n) {
            temp[idxtmp++] = 0;
        }

        // Step 3: Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print final modified array
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
