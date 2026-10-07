// Leetcode -1047 
/* 
Simple Approach  
   Observation due adjacent duplicate we can use Stack here easy to pop
  -create a stack of character , if stack is empty push the first character
  - check the peek and pushing character if equals just pop it and move forward else push it 
  - then pop it but as we want desired output according to question we have to reverse it 
  - we use string builder for minimum operation here we add the popping chacter from stack and then reverse it and print it 
*/


import java.util.*;
class RAdjDup{
  public static void removeDuplicates(String s){
      Stack <Character> st = new Stack<>();
      for(int i =0;i<s.length();i++){
        char ch = s.charAt(i);
         if(st.isEmpty()){
           st.push(s.charAt(i));
         }
        else if(st.peek()==ch){
           st.pop();
        }
        else{
          st.push(ch);
         }
      }
     StringBuilder sb = new StringBuilder();
     while(!st.isEmpty()){
       sb.append(st.pop());
     }
    System.out.println(sb.reverse().toString());
  }
  public static void main(String args[]){
      String st ="abbaca";
      removeDuplicates(st);
  }
}
