/*
 * Problem Title: Second Largest Element in Array
 * Role / Category: Array Data Structure
 * Student Notes: 
 *   - Goal: Find the second highest value in an array.
 *   - Method 1: Sort the array and pick arr[N-2] (Assumes distinct elements).
 *   - Method 2: Sort the array and iterate backwards to handle duplicates.
 * 
 * Time Complexity: O(N log N) - due to sorting
 * Space Complexity: O(1) - in-place sorting
 */

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        // Sample array with distinct elements
        int arr[] = {12, 35, 1, 10, 34};  
        
        // Sample array with duplicate largest elements (35 occurs twice)
        int arr1[] = {12, 35, 1, 10, 34, 35};

        // Method 1: Simple access for distinct arrays
        Arrays.sort(arr);
        int m = arr.length;
        System.out.println("Second Largest element (Unique Array): " + arr[m - 2]);

        // Method 2: Handle duplicates by traversing backwards from second-to-last index
        Arrays.sort(arr1);
        int n = arr1.length;
        for (int i = n - 2; i >= 0; i--) {
            // Find the first element that is less than the max element arr1[n-1]
            if (arr1[i] != arr1[n - 1]) {
                System.out.println("Second Largest element (Duplicate Array): " + arr1[i]);
                return;
            }
        }
        // If all elements are identical, there is no second largest
        System.out.println("No second largest element: " + -1);
    }
}
