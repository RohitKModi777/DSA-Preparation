import java.util.*;
class Merge{

  public static void divide(int arr[] , int low, int high){
     // have to divide the element from the mid after dividing we will reach that element where low and high pointer will be equal that is the edge case of it
    if(low == high) return ;
    int mid = low + (high-low)/2;
    divide(arr,low,mid);  //left half divide
    divide(arr,mid+1,high); //right half divide
    conquer(arr,low,mid,high);  //conquering in the sorted one
  }

  public static void conquer(int arr[], int low, int mid, int high)
  {
    // have to create temp array where we store the divided element and store the final result
    int temp[] = new int [high-low+1];
    int lp = low;
    int rp = mid+1;
    int tpidx =0;
    while(lp<=mid && rp<=high){
      // checking element and sort it by checking smallest element
       if(arr[lp]<arr[rp])
       { 
         // putting the smallest element in the temp array
         temp[tpidx] = arr[lp];
         tpidx++;  //increasing the pointer idx of temp array
         lp++; //chcking next element from the array
       }
      else{
        // if right element is minimum then store that element into the temp array
         temp[tpidx] = arr[rp];
         tpidx++;
         rp++;
      }
    }
    // what about the remainig element which can be the same can't compare
    while(lp<=mid){
      temp[tpidx] = arr[lp];
      lp++;
      tpidx++;
  }
    while(rp<=high){
      temp[tpidx] = arr[rp];
      tpidx++;
      rp++;
    }
    // now iterating the temp array and print it so we have to take a pointer for it that pointer is original pointer
    int op = low;
    for(int val : temp){
       arr[op] = val;
       op++;
    }
  }

  public static void main(String [] args)
  {
    int arr[] = {4,5,1,2,3};
    int low =0;
    int high = arr.length-1;
    divide(arr,low,high);
    System.out.println(Arrays.toString(arr));
  }
}
