/*
  Q4. Given an integer array nums and an integer k, return the number of good subarrays of nums.
     A good array is an array where the number of different integers in that array is exactly k.
      For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
       A subarray is a contiguous part of an array.
      Input: nums = [1,2,1,2,3], k = 2
      Output: 7
        Exact k = atmost(k) - atmost(k-1)
        Count subarrays with atmost k unique/distinct values -> nums = [1,2,1,2,3], k = 2
*/

/* 
  Approach
RIGHT → ADD  -> distinct > k ? -> LEFT → REMOVE -> count += right-left+1
*/

import java.util.*;
class Main {
    // Maximum k different numbers wale subarrays count karo
    public static int atMostK(int[] nums, int k) {
        int left = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right = 0; right < nums.length; right++) {
            // Current number ko map me add karo
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            // Agar different numbers k se zyada ho gaye
            while(map.size() > k) {
                // Left wala number hatao
                map.put(nums[left], map.get(nums[left]) - 1);
                // Agar uski frequency 0 ho gayi
                if(map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            // Current window se naye valid subarrays
            count += right - left + 1;
        }
        return count;
    }


    public static void main(String[] args) {

        int nums[] = {1, 2, 1, 2, 3};
        int k = 2;
        // Exactly k = AtMost(k) - AtMost(k-1)
        int ans = atMostK(nums, k) - atMostK(nums, k - 1);
        System.out.println(ans);
    }
}
