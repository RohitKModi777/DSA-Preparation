//  Leetcode Q-28
// Approach
/*   we know substring method and equal method so we use this methods for finding teh index of the first occurence of the string
  - we know that we will find the needle string in haystack string so we will take the haystack length-needle length so it will cover necessary length only
  - we use substring in haystack and then compare with the needle string if we found the string of needle in the haystack just return index
     - else we return -1
*/

class StringOccurence{
  public static int findNeedleOccurence(String h, String n){    
    for(int i=0;i<=h.length()-n.length();i++){
      if(h.substring(i,i+n.length()).equals(n)){
        return i;
      }
    }
    return -1;
  }
  public static void main(String [] args){
    String haystack = "sadbutsad";
    String needle = "sad";
    findNeedleOccurence(haystack,needle);
  }
}
