// leetcode -290 similar to Isomorphic string (lc-205)  one change  only here is mapping with the word for the clarity check the isomorphic.java
import java.util.*;
class wordP{
  public static boolean wordP(String pattern , String s){
     HashMap<Character, String> map1 = new HashMap<>();
     HashMap<String,Character> map2 = new HashMap<>();
      if(pattern.length() != s.length()) return false;
     String words[] = s.split(" ");  //converting into array
    
     for(int i =0;i<pattern.length();i++){
        char ch = pattern.charAt(i);
        String word = words[i];   //get the word of the s string 
        if(!map1.containsKey(ch)){ 
           map1.put(ch,word);
        }
       else if(!map1.get(ch).equals(word)){
         return false;
       }
        if(!map2.containsKey(word)){
           map2.put(word,ch);
        }
       else if(!map2.get(word).equals(ch)){
         return false;
       }
     }
    return true;
  }
  public static void main(String []args){
      String a ="abba";
      String b ="dog cat cat ";
      System.out.println(wordP(a,b));
  }
}
