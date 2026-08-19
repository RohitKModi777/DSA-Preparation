package LinkedList;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int val){
        this.data = val;
        this.next = null;
    }
}
public class mergeTwoSortedll {
    
    // Method-1
    
    /* #### Approach ### 
    -> create an arraylist store -> store both list into the arraylist -> sort it
    -> create dummy node with value 0 or -1
    -> then iterate over the arraylist
    -> then cunnect the dummy node with the array list value by using get typecast it into node 
    ->then return dummy.next 
    */


    public static Node mergeSortedll(Node a, Node b){
        ArrayList<Integer> arr = new ArrayList<>();

        while(a!=null){
            arr.add(a.data);
            a=a.next;
        }

        while(b!=null){
            arr.add(b.data);
            b=b.next;
        }
        
        Collections.sort(arr);
        Node dummy = new Node(-1);
        Node curr = dummy;
        for(int i =0;i<arr.size();i++){
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
    
    //Method -2

    /* ##Approah-2##
    -> create a dummy node
    -> iterate both list till not equal to null
      -compare list1 value with the list2 value
      -then connect with the dummy pointer
      - if any node remaining then point it's    next dummy pointer with that list node  
     */
    public static Node mergeSortllM2(Node list1, Node list2){
        Node temp = new Node(0);
        Node curr = temp;

        while(list1!=null && list2!=null){
            if(list1.data <=list2.data){
               curr.next = list1;
               list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1!=null) curr.next = list1;
        if(list2!=null) curr.next = list2;
        return temp.next;

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
        
        Node res = mergeSortedll(head1, head2);
        printList(res);
        Node result = mergeSortllM2(head1, head2);
        printList(result);

    }
}
