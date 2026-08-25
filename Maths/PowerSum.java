import java.util.*;

// We have to find that the number is equal to it's length power or not 
// for example 153 = 1^3 +5^3+3^3 = 3 + 125 +27 =153

class PowerSum{
  public static void main(String args[]){
     int num = 153;
    // for getting the length of the number we have to convert into string
     int length = String.valueOf(num).length();
     int res =0;
     // storing the value of num so it will check with got sum
     int originalNum = num;

     while(num>0){
       int temp = num%10;
       res += (int) Math.pow(temp,length);
       m = m/10;
     }
     if(res == originalNum){
       System.out.println("true");
     }
    System.out.println("false");
  }
}


// Dry Run
/* 
num = 153 => getting length by converting into string length=3 , original =num
res =0
num>0 -> res = 0 + num%10 -> 0+ 153%10,^length -> 0+3^3 =27 -> res=27, num/10->153/10=>15
    ->res = 27 + 5^3 =27+125 =152
    ->res = 152 +1^3 =153
 comparing originalNum == res -> 153==153 -> return true   
*/
