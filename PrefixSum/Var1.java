// Leetcode -1413  (Minimum Value to get postive step byt step sum) 
/**** where ever the step by step sum or running sum try to use or think about prefixSum ****/ 
     // "How much money/energy/health should I start with so that after every transaction/change, I never go below 1?"  
/* 
Question says that x <1  
solution x + y >= 1 y is the startvalue through which we get the sum 
*/

class Var1{
  public static int prefSumVar1(int arr[]){
      int sum =0;
      int minPrefSum =0;
      for(int i =0;i<arr.length;i++){
          sum += arr[i];
          minPrefSum = Math.min(sum,minPrefSum);
      }
      return 1-minPrefSum; // by observation of question 
  }
  public static void main(String args[]){
    int arr[] ={-3,2,-3,4,2};
    System.out.println(prefSumVar1(arr));
  }
}
