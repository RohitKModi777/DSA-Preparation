package LinkedList;

class ListNode{
    int data;
    ListNode next;
    ListNode(int val){
        this.data = val;
        this.next = null;
    }
}

public class DeleteGivenNode {
      
    public static void deleteNode(ListNode delNode){
        delNode.data = delNode.next.data;
        delNode.next = delNode.next.next;
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(5);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(9);
        a.next = b;
        b.next =c;
        c.next = d;
        System.out.print("Ater Deletetion node of the linkedlist which is given node for deleting: ");
        deleteNode(b);
        ListNode temp = a;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print("->");
            }

            temp = temp.next;
        }
    }
}
