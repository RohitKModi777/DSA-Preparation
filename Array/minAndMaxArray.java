/*
 * Problem Title: Find Minimum and Maximum Element in Array
 * Role / Category: Array Fundamentals
 * Student Notes:
 *   - Goal: Identify the smallest and largest numbers in an unsorted array.
 *   - Approach: Convert to ArrayList, sort ascending using Collections.sort(), pick first & last.
 * 
 * Time Complexity: O(N log N)
 * Space Complexity: O(N)
 */

import java.util.*;

public class minAndMaxArray {
    public static ArrayList<Integer> minMaxElement(int[] arr) {
        // Step 1: Copy primitive array elements to an ArrayList
        ArrayList<Integer> ls = new ArrayList<>();
        for (int a : arr) {
            ls.add(a);
        }
        
        // Step 2: Sort the ArrayList in ascending order
        Collections.sort(ls);

        // Step 3: Extract min (index 0) and max (last index)
        ArrayList<Integer> res = new ArrayList<>();
        res.add(ls.get(0));                // Minimum element
        res.add(ls.get(ls.size() - 1));    // Maximum element
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5, 10, 4, 11, 20, 50, 45};
        System.out.println("[Min, Max]: " + minMaxElement(arr));
    }
}
