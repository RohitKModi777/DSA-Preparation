/* Q- checking the concatenation string of  different string array will be the same or not if not return false if yes then return true   */


class ComparingArraysString{

  public static boolean ConcatString(String arr1[], String arr2[]){
        String res ="";
        String res1 ="";
    
       for(String s : arr1){
         res = res + s;
       }
    
       for(String t : arr2){
         res1 = res1 + t;
       }
    
     return res.equals(res1);
  }
  
  public static void main(String[] args){
    String str1[] = {"a","bc"};
    String str2 [] = {"ab","c"};
    System.out.println(ConcatString(str1,str2));
  }
}
