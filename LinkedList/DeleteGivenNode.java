/*
 * Problem Title: Delete Given Node in a Linked List (Without Head Pointer)
 * Role / Category: Linked List Manipulation
 * Student Notes:
 *   - Goal: Delete a node given ONLY a reference/pointer to that node.
 *   - Solution Trick: Copy the data from the next node into the current node, then bypass the next node!
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package LinkedList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int val) {
        this.data = val;
        this.next = null;
    }
}

public class DeleteGivenNode {
      
    // Delete node by copying data from next node
    public static void deleteNode(ListNode delNode) {
        if (delNode == null || delNode.next == null) return; // Edge case
        delNode.data = delNode.next.data;     // Copy data of next node
        delNode.next = delNode.next.next;     // Skip/bypass next node
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(9);
        a.next = b;
        b.next = c;
        c.next = d;

        System.out.print("Linked List before deletion: ");
        printList(a);

        // Delete node 'b' (value 5)
        deleteNode(b);

        System.out.print("Linked List after deleting node (value 5): ");
        printList(a);
    }

    private static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
