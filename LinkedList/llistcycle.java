package LinkedList;

import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node(int val ){
        this.data = val;
        this.next = null;
    }
}

public class llistcycle {
    
    // Method 1
    public static boolean hasCycleM1(Node head){
        // Node curr = head;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    // Method 2
    public static boolean hashSetM2(Node head){
        HashSet <Node> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)) return true;
            set.add(head);
            head= head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head.next;
        System.out.println(hasCycleM1(head));
        System.out.println(hashSetM2(head));
       ;
    }
}
