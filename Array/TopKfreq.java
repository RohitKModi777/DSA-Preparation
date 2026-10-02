// Leetcodde - 347 (Top K Frequent Element)  - two solution with Heap and Bucket Sort


import java.util.*;
class topKfreq{

  import java.util.*;

class Solution {
  
    public int[] topKFrequent(int[] nums, int k) {
          /*
         Bucket Sort 
          - create a map of frequecy of elements 
          - create a freq of element of the index of the array 
          - then store bucket list<list<integer>> based on the frequemcy of element then traverse from the last so we can get the largest freq element based on the k size 
          T.c =O(n)
        */ 
      
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
      // Bucket index = frequency
        ArrayList<Integer>[] bucket = new ArrayList[nums.length + 1];
        // Put numbers into their frequency bucket
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(num);
        }

        // Get top k elements from highest frequency
        int[] ans = new int[k];
        int idx = 0;
        for (int i = nums.length; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    ans[idx++] = num;
                    if (idx == k)
                        break;
                }
            }
        }
        return ans;
    }
}


  public static void topKfreqEle(int []arr, int k){
     /*
       Approach
         -create a hashMap which store the frequency of the elements
         - create a minheap for storing the frequency min at top
         - if minheap size>k poll the peak element from minheap
         -atlast return result
         T.C = O(nlog(k))  k is the size of minheap
     */
     HashMap<Integer,Integer> map = new HashMap<>();
     for(int i =0;i<arr.length;i++){
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
     }
    
    PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));   //based on priority of min we are putting in minhep
    for(int num :map.keySet()){
       minheap.add(num);
       if(minheap.size()>k){
          minheap.poll();
       }
    }

    int[] ans = new int[k];
    int i=0;
    while(!minheap.isEmpty()){
       ans[i++] = minheap.poll();
    }
    System.out.println(Arrays.toString(ans));
  }
    
  public static void main(String[] args){
    int arr[] ={1,1,1,2,2,3};
    int k =2;
    topKfreqEle(arr,k);
  }
}
