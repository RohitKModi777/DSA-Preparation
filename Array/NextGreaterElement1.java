//Next Greater Elemment Leetcode(496)

/*
 Approach:-> we have to give the next element of nums1 array element based on nums2 array element
  - we create two thing HashMap , Stack 
  - hashmap for tracking the nums2 element and by default we know that no any element can be greater than the last element so we store as -1 frequency till stack emepty
  - when stack is not emepty or it's peek is not greater than the nums2 element if it happens we push that element
      -else push the element
  - at last when we store all element in stack and map then we iterate in nums1 array and will return the frequency of the nums1 element that will be the ans of the arrray of resultant of nums1 based array
*/

import java.util.*;
class NGE{
  public static void nextgreater(int a[],int b[]){
      Stack <Integer> st = new Stack<>(); //helps to store the nge temporarrily
      HashMap <Integer,Integer> map = new HashMap<>();  //nums2 array se nge find karney ke liye
      int n = b.length;
      int ans[] = new int[a.length];
      for(int i =n-1;i>=0;i--){
          while(!st.empty() && st.peek()<b[i]){
            st.pop();
          }
          if(st.empty()){
             map.put(b[i],-1);  //no any element can be greater than last element 
          }
        else{
           map.put(b[i],st.peek());
        }
           st.push(b[i]);
      }
      for(int i =0;i<a.length;i++){
          ans[i] = map.get(a[i]);
      }
    System.out.println(Arrays.toString(ans));
  }
  public static void main(String[] args){
      int nums1[] ={4,1,2};
      int nums2[] ={1,3,4,2};
      nextgreater(nums1,nums2);
  }
}
