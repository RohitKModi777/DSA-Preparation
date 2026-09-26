/*
Approach:
1. An array of n elements has 2^n possible subsets,  We use numbers from 0 to (2^n - 1) as bitmasks.
 Each bit of the number represents one element:
      0 -> element is NOT selected
      1 -> element IS selected
2. For every subset (i), check every element (j).
3. (1 << j) creates a mask where only the j-th bit is 1.
   Example:
      j = 0 -> 1 << 0 = 001
      j = 1 -> 1 << 1 = 010
      j = 2 -> 1 << 2 = 100
4. (i & (1 << j)) checks whether the j-th bit of i is 1.
      Result != 0 -> j-th element is selected -> add nums[j]
      Result == 0 -> j-th element is not selected -> skip it
5. After checking all elements, add the current subset to the answer.

Example: nums = [1,2,3]
i = 5 -> binary 101

j = 0: 101 & 001 = 001 -> 1 is selected
j = 1: 101 & 010 = 000 -> 2 is not selected
j = 2: 101 & 100 = 100 -> 3 is selected

So subset = [1,3]

Time Complexity: O(n * 2^n)
Space Complexity: O(n * 2^n)
*/


import java.util.*;
class Subset{
  public static List<List<Integer>> subsetBitM(int nums[]){
     List<List<Integer>> ls = new ArrayList<>();
     int n = nums.length;
     int subsetLen = (int)Math.pow(2,nums.length);
     for(int i =0;i<subsetLen;i++){
       List<Integer> ans = new ArrayList<>();
       for(int j =0;j<n;j++){
           if((i & (1<<j))!=0){
              ans.add(nums[j]);
           }
       }
       ls.add(ans);
     }
    return ls;
  }
  
  public static void main(String [] args){
      int ans [] = {1,2,3};
      System.out.println(subsetBitM(ans));
  }
  
}
