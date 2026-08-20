/*
 * Problem Title: Detect Cycle in Linked List
 * Role / Category: Two Pointers / Floyd's Cycle Detection / Hashing
 * Student Notes:
 *   - Method 1 (Floyd's Cycle Detection): Slow pointer moves 1 step, fast pointer moves 2 steps.
 *     If they meet, a cycle exists!
 *   - Method 2 (HashSet): Store visited node references. If node re-appears, cycle exists!
 * 
 * Time Complexity: O(N) for both methods
 * Space Complexity: O(1) for Method 1, O(N) for Method 2
 */

package LinkedList;

import java.util.HashSet;

public class llistcycle {
    
    // Method 1: Floyd's Fast and Slow Pointer Algorithm
    public static boolean hasCycleM1(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;            // Advance 1 step
            fast = fast.next.next;       // Advance 2 steps
            if (slow == fast) return true; // Collision detected -> Cycle present!
        }
        return false;
    }

    // Method 2: HashSet Storing Visited Nodes
    public static boolean hashSetM2(Node head) {
        HashSet<Node> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true; // Node already seen -> Cycle present!
            set.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head.next; // Creates cycle back to Node 20

        System.out.println("Cycle detected (Floyd's Algorithm): " + hasCycleM1(head));
        System.out.println("Cycle detected (HashSet Method): " + hashSetM2(head));
    }
}
