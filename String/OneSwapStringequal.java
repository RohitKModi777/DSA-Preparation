// Leetcode - 1790
/* 
Approach
- first we check the swapping is not more than 1 times and for determining this we can track the index changing 
- we take an array of 2 size , with mismatch track variable 
- if charater not equal there is a chances of swapping occured 
- atlast we check the index matches by observation 
*/
class OneSwap{
  public static boolean OneSwapString(String s1, String s2){
     // given already equal length of the string so will not check that case
    if(s1.equals(s2)) return true;
    int mismatch =0;
    int arr[] = new int[2];    // we make two size array bcoz one swapping only allowed with two index
    for(int i =0;i<s1.length();i++){
        if(s1.charAt(i) != s2.charAt(i)){
           mismatch ++;
           if(mismatch>2)   // means swapping is only can by two placess not more tahn that otherwise it will become more than one swapping
           {
              return false;
           }
          arr[mismatch-1] = i;
        }
     }
      return s1.charAt(arr[0]) == s2.charAt(arr[1])  &&  s1.charAt(arr[1]) == s2.charAt(arr[0]);
  }
    
  public static void main(String args[]){
    String s ="bank";
    String t = "kanb";
    boolean a = OneSwapString(s,t);
    System.out.println("The answer of one swapping string equal or not is : " + a);
  }
}
