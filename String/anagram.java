/*
 * Problem Title: Check if Two Strings are Anagrams
 * Role / Category: String Manipulation / Sorting
 * Student Notes:
 *   - Anagram: A word formed by rearranging the letters of another word.
 *   - Approach:
 *       1. Compare lengths. If lengths differ, return false.
 *       2. Convert strings to character arrays, sort both arrays, compare equality.
 * 
 * Time Complexity: O(N log N)
 * Space Complexity: O(N)
 */

package String;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "ekegs";
        
        if (s1.length() != s2.length()) {
            System.out.println("No (Lengths differ)");
            return;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        
        // Sort character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes (Strings are Anagrams)");
        } else {
            System.out.println("No");
        }
    }
}
