/* Anagram - same length of the two words and same letter's frequency should be there and no other letter present except the letter which is present in word1 or word2*/ 
/* 
  Bruit Approach
   - outer loop iterate over each string 
   - inner loop take one by one string
      -compare with other string into array by sorting of current string 
      - then add into the list
      T.C= O(n) + O(n) + O(klogn)
   Better Approach 
     - create a HashMap of string as key and list of string as value
     - convert into character array, sort it , then again convert that character into the string
     - if map not contains any key just put the sorted string and add new arraylist then get that sorted key and add that current string
     - else  if it is in map already  then get that key and store it's string value
     - at last return the values of the hashmap key
     T.C = O(n) + O(nlogn) + O(1)
  Best Approach or Optimal Approach
    - create a HashMap of string as key and list of string as value
     - convert into character array, create a freq array and increase the count , then again convert that freq array element into the string
     - if map not contains any key just put the sorted string and add new arraylist then get that sorted key and add that current string
     - else  if it is in map already  then get that key and store it's string value
     - at last return the values of the hashmap key
     T.C = O(n) + O(1) + O(1)
*/
import java.util.*;
class GroupAnagram{
  public static List<List<String>> gAnagram(String[] str){
      HashMap <String,List<String>> map = new HashMap<>();
    for(String s : str){
      int[] ch_freq = new int[26];
      for(char ch: s.toCharArray()){
        ch_freq[ch-'a']++;
    }
      String char_s = Arrays.toString(ch_freq);
      map.computeIfAbsent(char_s,key->new ArrayList<>()).add(s);
    }
    return new ArrayList<>(map.values());
  }
  public static void main(String args[]){
    String [] strs= {"eat","tea","tan","ate", "nat", "bat"};
    System.out.println(gAnagram(strs));
  }
}
