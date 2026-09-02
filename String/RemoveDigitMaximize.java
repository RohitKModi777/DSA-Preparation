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
  
  public static void main(String args[]){
    String str ="1231";
    char digit = '1';
    System.out.println(removeGetMaximum(str,digit));
  }
}
