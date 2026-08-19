package LinkedList;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next =null;
    }
}
public class middleNode {

    public static void mNode(Node head){
         Node slow = head;
         Node fast = head;

         while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
         }
         System.out.println("middle node is: " + slow.data);
    }

    public static Node reverseLL(Node head){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printlist(Node head){
        while(head!=null){
            System.out.print(head.data);
            if(head.next!=null){
                System.out.print("->" + "");
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
        printlist(a);
        mNode(a);
        a=reverseLL(a);
        System.out.print("Reverse linked list is: ");
        printlist(a);
        mNode(a);
    }
}
