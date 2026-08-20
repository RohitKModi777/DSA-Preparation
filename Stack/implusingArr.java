/*
 * Problem Title: Stack Implementation Using Array
 * Role / Category: Stack Data Structure (LIFO - Last In First Out)
 * Student Notes:
 *   - Stack ADT (Abstract Data Type) Operations:
 *       1. Push: Add element to top (Check stack overflow).
 *       2. Pop: Remove top element (Check stack underflow).
 *       3. Peek: Return top element without removing it.
 *       4. isEmpty: Check if stack has 0 elements.
 * 
 * Time Complexity: O(1) for all stack operations
 * Space Complexity: O(Capacity)
 */

package Stack;

class myStack {
    private int[] arr;
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public myStack(int cap) {
        capacity = cap;
        arr = new int[capacity];
        top = -1; // -1 indicates empty stack
    }

    // Push operation
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    // Pop operation
    public int pop() {
        if (top == -1) { 
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Peek top element
    public int peekEle() {
        if (top == -1) return -1;
        return arr[top];
    }
}

public class implusingArr {
    public static void main(String[] args) {
        myStack st = new myStack(4);

        // Pushing elements onto stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // Popping one element
        System.out.println("Popped: " + st.pop());

        // Checking top element
        System.out.println("Top element: " + st.peekEle());

        // Checking if stack is empty
        System.out.println("Is stack empty: " + (st.isEmpty() ? "Yes" : "No"));
    }
}
