/*
 * Problem Title: Reverse a String
 * Role / Category: Two Pointer / StringBuilder
 * Student Notes:
 *   - Goal: Reverse the characters of a string.
 *   - Method 1: Two Pointer character swapping in StringBuilder.
 *   - Method 2: Reverse loop appending characters.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

package String;

public class reverseString {
    public static void main(String[] args) {
        String s = "Dev";
        int left = 0;
        int right = s.length() - 1;

        StringBuilder str = new StringBuilder(s);
        
        // Method 1: Two-pointer swap
        while (left < right) {
            char temp = str.charAt(left);
            str.setCharAt(left, str.charAt(right));
            str.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println("Reversed String (Two Pointer): " + str);

        // Method 2: Iterative append from right to left
        StringBuilder str1 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            str1.append(s.charAt(i));
        }
        System.out.println("Reversed String (Reverse Loop): " + str1.toString());
    }
}
