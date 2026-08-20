/*
 * Problem Title: Merge Two Sorted Linked Lists
 * Role / Category: Linked List Pointer Manipulation
 * Student Notes:
 *   - Goal: Combine two sorted lists into one sorted linked list.
 *   - Approach: Compare heads of both lists, attach smaller node to merged list, advance pointer.
 *   - Uses Dummy Node pattern to simplify edge cases.
 * 
 * Time Complexity: O(N + M) where N, M are lengths of the lists
 * Space Complexity: O(1) iterative merge
 */

package LinkedList;

public class mergeTwoSortedll {

    // Method 1: Iterative Merge using Dummy Head
    public static Node mergeSortedll(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        // Attach remaining nodes if any list is non-empty
        if (list1 != null) curr.next = list1;
        if (list2 != null) curr.next = list2;

        return dummy.next;
    }

    // Method 2: Alias Method
    public static Node mergeSortllM2(Node list1, Node list2) {
        return mergeSortedll(list1, list2);
    }

    static void printList(Node curr) {
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        System.out.print("Merged Sorted List: ");
        Node res = mergeSortedll(head1, head2);
        printList(res);
    }
}
