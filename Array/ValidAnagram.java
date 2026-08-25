class Anagram {

  // Frequency counter method
  //  Time Complexity = O(N)
  public static boolean isAnagram(String s , String t){
    if(s.length() !=t.length()) return false;
    int frq[] = new int[26];

    for(char ch : s.toCharAArray()){
       freq[ch-'a']++;
    }

    for(char ch : t.toCharArray()){
      freq[ch-'a']--;
      if(freq[ch-'a']<0) return false;
    }
    return true;
  }
  
  // Sorting method
  //  Time Complexity = O(NlogN)
  public static boolean isAnagramM2(String s , String t){
    if(s.length() !=t.length()) return false;
    char [] str = s.toCharArray();
    char[] str1 = t.toCharArray();
    Arrays.sort(str);
    Arrays.sort(str1);
    return Arrays.equals(str,str1);
  }
  
  public static void main(String args[]){
    String s = "abc";
    String t = "bac";
    System.out.println(isAnagram(s,t));
    System.out.println(isAnagramM2(s,t));
  }
}
