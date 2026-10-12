// Leetcode -128 Based on Question understanding the sequence means diff is 1 and if one elemnet by default that is already considerd as sequence
// observation if same element then we skit that elemnet and continue , if the difference is not 1 that consider as different sequence

/*
Approach -sort array check observation condition and use max variable which helps to get the max length of conssecutive sequence
T.C - O(nlogn)
*/

import java.util.*;
class LCS{
  public static int longestConS(int nums[])
  {
     int count =1;
    int maxLen =1;
    Arrays.sort(nums);
    for(int i =1;i<nums.length;i++)
    {
      if(nums[i]== nums[i-1]){   //duplicate element
         continue;
      }
      else if(nums[i]-nums[i-1]==1)    //sequence condition
      {
         count++;
      }
      else{
         count =1;    //reset the count when the difference is not 1
      }
      maxLen = Math.max(count,maxLen); // max length identifying
     }
    return maxLen;
  }


  public static int longestConSOptimize(int nums[]){
    HashSet<Integer> set = new HashSet<>();  // it automatic handles the duplicated case
    int maxLen =0;
    for(int n : nums){
       set.add(n);
    }
    
    for(int a:set)
      {
        if(!set.contains(a-1))   // where to start the sequence is the main motive we know the difference should be one if the elemnet which is not present n-1 we start the sequence from there 
        {
           int count =1;
            while(set.contains(a+count)) //if it is present in the sequence we increase the count
           {
                count++;
            }
          maxLen = Math.max(maxLen,count);
         }
      }
    return maxLen;
  }
  
  public static void main(String args[]){
    int arr[] ={100,4,200,1,2,3};
    System.out.println(longestConS(arr));
    System.out.println(longestConSOptimize(arr));
  }
}
