/*
 * Problem Title: Find Middle Node & Reverse Linked List
 * Role / Category: Linked List Algorithm
 * Student Notes:
 *   - Middle Node Technique: Slow pointer (1 step) and Fast pointer (2 steps).
 *     When Fast reaches end, Slow is at middle!
 *   - Reverse List Technique: Iterative reversal using prev, curr, next pointers.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

package LinkedList;

public class middleNode {

    // Fast and Slow pointer algorithm for finding middle node
    public static void mNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps
        }
        if (slow != null) {
            System.out.println("Middle node data: " + slow.data);
        }
    }

    // Iterative reversal of Linked List
    public static Node reverseLL(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;   // Store next pointer
            curr.next = prev;   // Reverse connection
            prev = curr;        // Advance prev
            curr = next;        // Advance curr
        }
        return prev; // New head of reversed list
    }

    public static void printlist(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(20);
        a.next = new Node(30);
        a.next.next = new Node(40);
        a.next.next.next = new Node(50);

        System.out.print("Original List: ");
        printlist(a);
        mNode(a);

        a = reverseLL(a);
        System.out.print("Reversed Linked list: ");
        printlist(a);
        mNode(a);
    }
}
