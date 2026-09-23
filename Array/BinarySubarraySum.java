// Leetcode -q -930 similar question to 1248(count nice sum subarray)

// Approach simple we use variable sliding window for getting the subarray sum equal to goal and return subarray whch is made based on the condition
// T.C ~ b/w O(n) and O(n)^2

class BSSum{
  public static int atostSumSa(int[]arr,int goal){
      int left =0;
      int suba=0;
      int sum =0;
      for(int right =0;right<arr.length;right++){
          sum += arr[right];   //adding current element of array
          while(sum>goal && left<=right){    
             sum -=arr[left];   //decreasing left element or removing first element
             left++;  //going forward
          }
        suba +=right-left+1;  //atlast taking the subarray which is created while making required subarray based on goals and then count it each time
      }
    return suba;
  }
  public static void main(String[] args){
      int nums[] = {1,0,1,0,1};
      int goal =2;
      int ans =atmostSumSa(nums,goal) - atmostSumSa(nums,goal-1);   //simple thinking when we subtract the data which is less than and equal to the condition which is less than then we got equal to as the final answer
      System.out.println(ans);
  }
}
