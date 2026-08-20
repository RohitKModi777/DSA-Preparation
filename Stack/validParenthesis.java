package Stack;
import java.util.*;

public class validParenthesis {
    public static boolean isBalanced(String s){
        Stack <Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('||c=='{'||c=='[') 
                st.push(c);
            else if(c=='}'||c==']'||c==')'){
                if(st.isEmpty()) return false;
                if(c==']' && st.peek()!='['||
                   c=='}' && st.peek()!='{'||
                   c==')' && st.peek()!='('){
                    return false;
                   }
                   st.pop();
            }
        }
       return st.isEmpty();
    }
    public static void main(String[] args) {
        String s ="[{(})}]";
        System.out.println((isBalanced(s) ? "true" : "false"));
    }
}
