//Leetcode(918)  Observation + claim  {for clarity check this https://youtu.be/Za8V4wkZKkM?si=Br96wyPYgVNtUdpr}
 /* 
    - Case 1- the max sum we can find in the given array without circulation
    - Case 2- the max sum we can find in the give array with circulation
 */
// after circulation the first partition and last partition may have maximum sum subarray and mid part always have minimum subarray how i can say that?
 /*
   totalSum = s1+s2 {where s2 =minimum i claimed and s1- maximum subarray simple by kadane's algo}
   mathematical intution if x=a+b (b is not minimum then absolutel the x will be maximum so s1 will be wrong which is not correct 
     for example : 10 = 6 + 4 {where b =4, if b =6 definitely x should be 12 so x will increase means b should be in lesser value }) 
 */


class MCSS{
  public static int kadanesMax(int a[]){
     int sum =a[0];
     int max=a[0];
      for(int i =1;i<a.length;i++){
         sum = Math.max(sum +a[i],a[i]);
         max = Math.max(max,sum);
      }
    return max;
  }
  
  public static int kadanesMin(int a[]){
     int sum =a[0];
     int min=a[0];
      for(int i =1;i<a.length;i++){
         sum = Math.min(sum +a[i],a[i]);
         min = Math.min(min,sum);
      }
    return min;
  }
  

  public static void main(String [] args){
     int nums[] ={-1,-1,-1};
     int total =0;
     for(int i =0;i<nums.length;i++){
        total += nums[i];
     }
    int minSum = kadanesMin(nums);
    int maxSum = kadanesMax(nums);
    int circMax = total -minSum;
    if(maxSum >0){
      int ms = Math.max(maxSum,circMax);
      System.out.println(ms);
    }
    else{
      System.out.println(maxSum);
      return;
     }
   }
}
