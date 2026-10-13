//Leetcode - 560  

import java.util.*;
class SSEK{
  public static int SubarrSumBF(int nums[], int k)
  {
    // Bruit Force counting all subarray with sum k
     int counts =0;
     for(int i=0;i<nums.length;i++){
        int sum =0;
        for(int j =i;j<nums.length;j++){
           sum += nums[j];
           if(sum == k)
           {
              counts ++;
           }
        }
     }
       return counts;
  }

  public static int SubarrSumKOp(int nums[], int k ){
     // using hash table and prefix sum,  if pref[0]= nums[0] => i=1 -> pref[i] = pref[i-1] + nums[i]
     HashMap<Integer,Integer> map = new HashMap<>();
     map.put(0,1); // for complementary check if nums[i]-k ==0 then we have to store it frequence and when it is needed , by default always 0 index have one frequence means 0->1
     int sum =0;
     int count =0;
     for(int i =0;i<nums.length;i++)
     {
        sum += nums[i];
        count += map.getOrDefault(sum-k,0);   // main part 
        map.put(sum,map.getOrDefault(sum,0)+1);
      }
    return count;
  }
  
  public static void main(String [] args)
  {
    int arr[] = {1,1,1};
    int k =2;
    // we can't use sliding window here because of negative elements because while deleting it can give wrong result 
    System.out.println(SubarrSumBF(arr,k));
    System.out.println(SubarrSumKOp(arr,k));
  }
}
