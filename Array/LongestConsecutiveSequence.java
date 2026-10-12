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
  
  public static void main(String args[]){
    int arr[] ={100,4,200,1,2,3};
    System.out.println(longestConS(arr));
  }
}
