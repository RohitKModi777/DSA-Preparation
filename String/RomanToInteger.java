//leetcode -13

//we have to convert the roman into number, we have the key value pair data so we use hashmap here
/* observation 
    - ix-> 9 -> i-1, x-10 ->10-1 or -1+10 =9
    -xi -> 11 -> 10+1 but it is limited it will be fail when we reach the 3 or4 digit number bcoz there will be a pairing start of adding or subtracting 
    so we subtract the next digit two times and add if first elemnet is greater than second one 
*/
import java.util.*;

class RI{
  public static int roman_Integer(String r){
    int ans =0;
    HashMap<Character,Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    
    for(int i =0;i<r.length();i++){
      if(i>0 && map.get(r.charAt(i))>map.get(r.charAt(i-1))){
         ans += map.get(r.charAt(i)) - 2 *(map.get(r.charAt(i-1)));   //repeated operation based on condition so we subtract it
      }
      else{
         ans += map.get(r.charAt(i));
      }
    } 
    return ans;
  }
  public static void main(String args[]){
    String s ="MCMXCIV";
    System.out.println(roman_Integer(s));
  }
}
