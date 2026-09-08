/*
Q. You are given a 0-indexed array nums of n integers, and an integer k.
   The k-radius average for a subarray of nums centered at some index i with the radius k is the average of all elements in nums between the indices i - k and i + k (inclusive). If there are less than k elements before or after the index i, then the k-radius average is -1.
   Build and return an array avg’s of length n where avgs[i] is the k-radius average for the subarray centered at index i.
   The average of x elements is the sum of the x elements divided by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.
   For example, the average of four elements 2, 3, 1, and 5 is (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.
   Input: nums = [7,4,3,9,1,8,5,2,6], k = 3
    Output: [-1,-1,-1,5,4,4,-1,-1,-1]
*/

/*    
     APPROACH
Is question ka pura logic:

window = 2*k + 1

First window:
SUM karo

Next window:
OLD hatao
NEW add karo

Average:
sum / window*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int nums[] = {7,4,3,9,1,8,5,2,6};
        int k =3;
        int n = nums.length;
        int sum =0;
        int window = 2*k+1;    //BECAUSE IT TAKING  i-k....i...i+k elemnets that's why 2k+1 element 
        
        int ans[] = new int[nums.length];
        Arrays.fill(ans,-1);    // if not have window sum then that will bee -1
        
        for(int i =0;i<window;i++){
            sum +=nums[i];
        }
        ans[k] = sum /window;
        
        for(int i =k+1;i<n-k;i++){
            sum -=nums[i-k-1];   // removing the first element
            sum +=nums[i+k];   // adding new element 
            ans[i] = sum/window;
        }
        System.out.println(Arrays.toString(ans));
    }
}
