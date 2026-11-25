/* Leetcode - 151 Reverse Word in a String*/

/*
Approach - we convert it into array then iterate from last and then storing it into the string and then added single space after reversing converting into stringa and then triming the leasing and trailing spaces.
*/


class ReverseWord{
  public static void main(String [] args){
    String st =" The sky is blue";
    System.out.println(reverseWord(st));
  }

  public static String reverseWord(String str){
      String word[] = str.split(" +"); 
      // It will help to add as necessary space want to add it will add regex converted into array
      StringBuilder sb = new StringBuilder();
    // because we want to reverse the array
    for(int i =word.length-1;i>=0;i--){
        sb.append(word[i]);
        sb.append(" ");   //adding every time single space when it is added word in a sb string
    }
      return sb.toString().trim();  //removing leading and trailing spaces
  }
}
