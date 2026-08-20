package Stack;

class myStack{
    private int[] arr;
    private int top;
    private int capacity;

    public myStack(int cap){
        capacity = cap;
        arr = new int[capacity];
        top=-1;
    }

    public void push(int x){
        if(top == capacity-1) 
            System.out.println("overflow stack");
        arr[++top]=x;
    }

    public int pop(){
        if(top == -1){ 
            System.out.println("stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public boolean isEmpty(){
        return top ==-1;
    }

    public int peekEle(){
        if(top ==-1) return-1;
        return arr[top];
    }
}
public class implusingArr {
    public static void main(String[] args) {
        myStack st = new myStack(4);

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peekEle());

        // checking if stack is empty
        System.out.println("Is stack empty: " +
                            (st.isEmpty() ? "Yes" : "No"));

    }
}
