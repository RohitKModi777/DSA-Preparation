/*
Isomorphic String (lc-205) - Two strings s and t are isomorphic if the characters in s can be replaced to get t. 
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself. 
*/

/*
Approach
 Better Approach -   we create two maps and  then iterate over one string a then take the character of both string check the condition if there is no key in the hashmap then put the character of first string and map1 the value of second string
            - if the key is already there then check the mapping of character of first string with the value of the character of the second string is correct or not if there's mapping is not correct return false wlse return true similarly we check with map2
            means map1(first string character) != second string charcter similarly with the map2(second string character) != first string character then return false 
            
 Optimize Approach -with the help of string inbuilt method indexOf() which return teh first occurence of the character
   -iterate over first string then check if the indexOf the first string character with it's first occurence if it is not equal with teh next string chacter of first occurence return false else return true check below code for clarity. 
*/

class IsomorphicString{
  public static boolean isoStringBetter(String a , String b){
     HashMap<Character, Character> map1 = new HashMap<>():
     HashMap<Character, Character> map2 = new HashMap<>():

    for(int i =0;i<a.length();i++){
       char ch1 =  a.charAt(i);
       char ch2 =  b.charAt(i);
        if(!map1.containsKey(ch1)) {
            map1.put(ch1,ch2);
        }
        else if(map1.get(ch1) != ch2){
          return false;
        }
        if(!map2.containsKey(ch1)) {
            map1.put(ch2,ch1);
        }
        else if(map2.get(ch2) != ch1){
          return false;
        }
     }
    return true;
  }
  public static boolean isoStringOptimize(String a , String b){
    for(int i =0;i<a.length();i++){
       if(a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i)))  return false;
    }
    return true;
  }

  public 
  public static void main(String [] args){
    String s ="add";
    String t = "egg";
    isoString(s,t);
    isoStringOptimize(s,t);
  }
}
