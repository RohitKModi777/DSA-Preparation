/* RansomNote is simple as a smuggling process in which there is two person doing the communication through the note and a paper where it is constructed throught the note  like oe person has the Note of "aab" and in paper it has 
the same letter as note*/ 

/*
Approach - Better and Optimal
  better)- take two hashmap count each strings frequency then go to the key set of that map through which we have to construct it if it's freq is greater than the constructed one return false else true
  optimal)- take two freq array increase the each frequecy based on both string ransomNote and magazine then we go from 0 to <26 check if freq of ransom note greter than magazine just return false else true;
*/

class RN{
  public static boolean canConstruct(String r, String s){
     HashMap<Character,Integer> map1 =  new HashMap<>();
        HashMap<Character,Integer> map2 =  new HashMap<>();
        for(int i =0;i<ransomNote.length();i++){
            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i =0;i<magazine.length();i++){
            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i),0)+1);
        }
    //  we can't use map1.equals(map2) because it is comparing the same letter with the same frequency so if you calculate of aa and aab it gives false which is wrong
        for(char c : map1.keySet()){
            if(!map2.containsKey(c) || map1.get(c)>map2.get(c)){   //simple observation whenever the character which is present in map1 key's frequency is greater than map2 key's frequency so it can't be construct so return false;
                return false;
            }
        }
        return true;
  }
  public static void main(String[] args){
     String ransomNote = "aa";
     String magazine ="aab";
     System.out.println(canConstruct(ransomNote,magazine));
  }
}
