/*
 * Problem Title: Palindrome String Check
 * Role / Category: String Basics
 * Student Notes:
 *   - Palindrome: A string that reads the same backward as forward (e.g., "abba", "racecar").
 *   - Approach: Reverse string using StringBuilder and check equality with original string.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

package String;

public class palindromeString {
    public static void main(String[] args) {
        String s = "abba";
        StringBuilder str = new StringBuilder();

        // Build reversed string
        for (int i = s.length() - 1; i >= 0; i--) {
            str.append(s.charAt(i));
        }

        // Compare original string with reversed string
        if (s.equals(str.toString())) {
            System.out.println("Yes (String is a Palindrome)");
        } else {
            System.out.println("No");
        }
    }
}
