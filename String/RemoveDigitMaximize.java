// for making the String maximum of number just remove digit to get maximum number 
// check leetcode Ques -2259

class RemoveDigitMaximize{
  
  public static String removeGetMaximum(String str, char digit){
    String maxStringDigit ="";
    for(int i =0;i<str.length();i++){
      if(str.charAt(i) == digit){
        // if string is start from 0 and end with 0 then it will be empty
        String currSub = str.substring(0,i) + str.substring(i+1);
        //  CompareTo helps to compare the value if it is greater than one then that will be the maximum
        // for exxample - a= hello, b= hello {check the alphabetical order where the h comes h=8} then h-h =0
        /* For further clearance check about compareTo function of String*/
        if(currSub.compareTo(maxStringDigit) >0){
          maxStringDigit = currSub;
        }
      }
    }
        return maxStringDigit;
  }

//  By observation checking if we remove the last element of digit present in repeating number we get maximum for example - 7237578
  /* when we remove last digit 7 of above example it will give me the maximum number*/
  // T.C =O(N)
    public String removeDigitM2(String number, char digit) {
      // we have to compare with the next one that's why we iterate from index one
       for(int i =1;i<number.length();i++){
         // when they reach with the digit
         if(number.charAt(i-1) == digit){
           // check the next elemnt is greater just remove it by using substring
            if(number.charAt(i-1)<number.charAt(i))
            {
                return number.substring(0,i-1) + number.substring(i);
            }
         }
       }
      // it helps to get the last occurence of the digit 
       int lastIndex = number.lastIndexOf(digit);
       return number.substring(0,lastIndex) + number.substring(lastIndex+1);
    }
  
  public static void main(String args[]){
    String str ="1231";
    char digit = '1';
    System.out.println(removeGetMaximum(str,digit));
    System.out.println(removeDigitM2(str,digit));
  }
}
