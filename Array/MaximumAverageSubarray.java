// Leetcode -643 have to find the max average value of the  max window sum
/*
Approach
Sliding Window we have to make the window of k size and get the sum of taht window and  next time you hgave to delete first element and take the right element 
k size window from 0->k
after this from 1->k,2->k size so on...
for achieving this you have to remove first element and add one right element 
*/

class MAS{
  public static double maxAverage(int arr[],int k){
      int curr_sum =0;
      int maxSum =0;
      for(int i =0;i<k;i++){
        curr_sum += nums[i];
      }
      maxSum  = curr_sum;
      for(int i =k;i<arr.length;i++){
        curr_sum += arr[k] -arr[i-k];   // removing first elemnet and adding right one elemnet for teh window size 
        if(curr_sum>maxSum){
           maxSum = curr_sum;
        }
      }
     return (double)maxSum/k;
  }
  public static void main(String[] args){
    int arr[] = {1,12,-5,-6,50,3};
    int k =4;
    System.out.println(maxAverage(arr,k));
  }
}
