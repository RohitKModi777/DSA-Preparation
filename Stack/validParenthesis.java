/*
 * Problem Title: Valid Parentheses / Balanced Parentheses Check
 * Role / Category: Stack Application
 * Student Notes:
 *   - Problem: Given a string containing brackets '()[]{}', verify if brackets are properly balanced.
 *   - Rules:
 *       1. Open brackets must be closed by the same type of brackets.
 *       2. Open brackets must be closed in the correct LIFO order.
 * 
 * Time Complexity: O(N) where N is length of string
 * Space Complexity: O(N) stack storage
 */

package Stack;

import java.util.*;

public class validParenthesis {
    public static boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push opening brackets onto stack
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // Handle closing brackets
            else if (c == '}' || c == ']' || c == ')') {
                if (st.isEmpty()) return false; // Mismatched closing bracket
                
                // Verify stack top matches closing bracket type
                if ((c == ']' && st.peek() != '[') ||
                    (c == '}' && st.peek() != '{') ||
                    (c == ')' && st.peek() != '(')) {
                    return false;
                }
                st.pop(); // Matching pair found
            }
        }
        // Stack must be empty if all brackets matched correctly
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{(})}]";
        System.out.println("Is String "" + s + "" balanced? " + (isBalanced(s) ? "true" : "false"));
    }
}
