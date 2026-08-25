class SingleDigit{
  public static void main(String args[]){
    // input = 38 output = 2
    // explaination => 38 -> 3+8 => 11 ->1+1 =2
    int n = 38;
   while(n>=10){
    // By running inner loop we get 11 for getting sum into single digit
    int sum =0; 
     while(n>0){
       sum = sum + n%10;
       n/=10;
      }
     // update n to sum so it will consider the sum as that number
     n= sum;
   }
    System.out.println(n);
  }
}
