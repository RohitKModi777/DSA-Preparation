/*
 * Problem Title: Remove Duplicates from Unsorted / Sorted Array
 * Role / Category: Array Data Structure / Hashing
 * Student Notes:
 *   - Method 1: Manual checking using nested loops into target array.
 *   - Method 2: Utilizing HashSet property (unique elements only).
 * 
 * Time Complexity: Method 1: O(N^2), Method 2: O(N)
 * Space Complexity: O(N)
 */

import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 5};
        int res[] = new int[arr.length];
        int idxres = 0;

        // Method 1: Manual duplicate check
        for (int i = 0; i < arr.length; i++) {
            boolean dup = false;
            for (int j = 0; j < idxres; j++) {
                if (arr[i] == res[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
               res[idxres] = arr[i];
               idxres++;
            }
        }
        System.out.print("Array without duplicates (Method 1): ");
        for (int m = 0; m < idxres; m++) {
            System.out.print(res[m] + " ");
        }
        System.out.println();

        // Method 2: Using HashSet
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
            }
        }
        System.out.println("Unique elements (HashSet Method 2): " + s);
    }
}
