// Ques - Write a javaa program to get teh single digit sum when it is greater than 10 or if less return it's total sum
/*
  Approach
    -> we use modulo to do the sum of that number , first we take a variable which track the sum of that number
    -> until the given number is greater than 0 we take a remainder and sum it and divide that number by 10 through this we get the total sum
    -> if sum>10 take a var to track the sum of already calculated sum the we do the same  process for getting the sum of that number
*/
class ReducedNumber{
  public static void main(String [] args){
    int number =1377;   
    int ans =0;
    while(number>0){      
      ans += number%10;
      number /=10;
    }
    int sum =0;
    while(ans>10){
      while(ans>0){
        sum += ans%10;
        ans /=10;
      }
     ans =sum;
    }
    System.out.println(ans);
  }
}
    
// for optimization check singleDigitSum.java file
