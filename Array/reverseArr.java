/*
 * Problem Title: Reverse an Array
 * Role / Category: Two-Pointer Technique / Array
 * Student Notes:
 *   - Goal: Reverse array in-place without creating a secondary array.
 *   - Two Pointer Algorithm: Initialize left=0, right=N-1. Swap arr[left] and arr[right], then left++, right--.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

import java.util.*;

public class reverseArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the array is: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Initialize two pointers
        int left = 0;
        int right = n - 1;

        // Perform in-place swapping
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
