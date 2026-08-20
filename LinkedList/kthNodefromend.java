/*
 * Problem Title: Find K-th Node from End of Linked List
 * Role / Category: Linked List Traversal
 * Student Notes:
 *   - Goal: Return data of K-th node from end (1-indexed).
 *   - Approach:
 *       1. Count total length of list (count).
 *       2. If k > count, return -1.
 *       3. Move (count - k) steps from head to reach target node.
 * 
 * Time Complexity: O(N) - Two passes
 * Space Complexity: O(1)
 */

package LinkedList;

class Node {
    int data;
    Node next;
    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class kthNodefromend {

    public static int nodefEnd(Node head, int k) {
        Node curr = head;
        int count = 0;
        
        // Pass 1: Count total nodes in Linked List
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Return -1 if k is greater than length of list
        if (k > count) {
            return -1;
        }

        // Pass 2: Traverse (count - k) steps from start
        curr = head;
        for (int i = 0; i < count - k; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);
        a.next.next.next.next.next = new Node(6);
        a.next.next.next.next.next.next = new Node(7);
        a.next.next.next.next.next.next.next = new Node(8);
        a.next.next.next.next.next.next.next.next = new Node(9);

        int k = 2;
        System.out.println("The " + k + "-nd node from end is: " + nodefEnd(a, k));
    }
}
