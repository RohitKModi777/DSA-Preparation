/*
 Write a java program which helps to convert the string charcters into lowercase without using inuilt method like toLowerCase()
 -Approach 
 -> as we know that ASCII value of 'a' = 97 , 'A'=65 so when we got 'A' char add with the 32 we get 'a' character 
 -> for example - "AbcDe" -> "abcde"
*/
class String Convert{
  public static Character conversion(char ch){
       if(ch>='A' && ch<='Z){            // condition chr from A to Z 
           char c = (char) (ch +32);    //converting into small char
          return c;                     //returning that character
       }
       return ch;  // if it is already in small character just return that character
  }
  public static void main(String[]args){
    String s ="AbCDe";
    String res = "";
    for(int i =0;i<s.length();i++){
      res += conversion(s.charAt(i));
    }
    System.out.println(res);
  }
}
