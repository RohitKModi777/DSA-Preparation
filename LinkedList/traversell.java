/*
 * Problem Title: Linked List Traversal
 * Role / Category: Fundamental Linked List Operation
 * Student Notes:
 *   - Traversal: Process of visiting every node in the linked list from head to tail.
 *   - Loop Condition: while (head != null)
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

package LinkedList;

public class traversell {

    // Traverses and prints nodes of linked list
    public static void traversellist(Node head) {
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
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.print("Traversing Linked List: ");
        traversellist(head);
    }
}
