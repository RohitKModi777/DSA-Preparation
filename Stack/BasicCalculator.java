// Basic Calculator (Hard) - LeetCode(224)
// ### first with stack wherever the parenthesis and there is asking of final result of it think about stack first ###

// Approach - Stack , Recursion
/* 
  Intution - we have to do 4 things 
    -> convert to digit 
    -> sign checking
    -> if there is open bracket what to do or how to compute out of bracket result
    -> if there is close bracket then what to do and after closing bracket how to get final result
  
  1) Stack approach  --> whenever open bracket encounter just push that res and sign before or out of open bracket and whenever encounter close bracket just pop teh res and sign before computationa nd update teh result
  2) Recusion approach ---> we take an index for tracking teh character while reaching on open bracket we havve to increase it so it can compute the previos result and after calling again it will go next character after computing the inner result of the bracket we reset that index that's why we have to globally wrote it and reset it into the main function.
*/

import java.util.*;
class BC{
  static int i=0;
  public static int computeM1Stack(String t){
        int res =0;    //final ans 
        int number =0;  // help to convert into digit
        int sign =1;    // default sign +ve or sign tracking
        Stack <Integer> st = new Stack<>();

        for(int i =0;i<t.length();i++)
          {
            char ch = t.charAt(i);
            if(Character.isDigit(ch)){
               number = number * 10 + (ch-'0');   // if there is continuous number like "123" we have to multiply the individual number with 10 and then conver character by subracting with 0
            }
            else if(ch == '+'){
               res += sign * number;    // res update with the sign and number
               sign =1;  // +ve detection
               number=0;  // number update
            }
              
            else if(ch == '-'){
               res += sign * number;
               sign =-1;  // sign update
               number=0;   // number reset
            }
            else if(ch =='('){
                st.push(res);   // pushing the current res before encounter with the bracket in stack
                st.push(sign);  // pushing sign for further decision of number
                res=0;  // update res
                sign =1;  
            }
            else if (ch==')'){
              res += sign * number;  // res update
              number =0;   //number reset
              int prevSign = st.pop();  // poping the signa nd prev res because it is computed already 
              int prevRes = st.pop();
              res = prevRes + res * prevSign;  // now internal context of bracket number computed here
              sign =1;  //sign update
          }
        }
      res += sign * number;  //after all adding individual section complete addition 
    return res;              //return main answer
  }

  
  public static int computeM2Recur(String t){
        int res =0;    //final ans 
        int number =0;  // help to convert into digit
        int sign =1;    // default sign +ve
       while(i<t.length())
          {
            char ch = t.charAt(i);
            if(Character.isDigit(ch)){
               number = number * 10 + (ch-'0');
            }
            else if(ch == '+'){
               res += sign * number;
               sign =1;
               number=0;
            }
              
            else if(ch == '-'){
               res += sign * number;
               sign =-1;
               number=0;
            }
            else if(ch =='('){
                i++;  // need to go with that index for computing res before bracket
               int internRes = computeM2Recur(t);  // helps to go inside the bracket and compute res
               res +=  sign * internRes;
               sign =1;
              number =0;
            }
            else if (ch==')'){
              res += sign * number;  // internal bracket computation completed
              return res; //returning res
          }
            i++; //for increament the index to reach next character
        }
      res += sign * number; //final computation result
    return res;              //final answer returns here 
  }
  
  public static void main(String[] args){
    String s ="(1+(4+5+2)-3)+(6+8)";
    int a = computeM1Stack(s);
      System.out.println(a);
    i=0;
    int b =computeM2Recur(s);
      System.out.println(b);
  }
}
