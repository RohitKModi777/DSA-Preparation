package LinkedList;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class kthNodefromend {

    public static int nodefEnd(Node head, int k){
        Node curr = head;
        int count =0;
        while(curr!= null){
            count++;
            curr = curr.next;
        }

        if(k>count){
            return -1;
        }
        curr = head;
        for(int i =0;i<count-k;i++){
            curr =curr.next;
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

        System.out.println(nodefEnd(a, 2));
    }
}
