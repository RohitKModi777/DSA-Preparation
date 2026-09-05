// Approach 3 
/*
1 -> sorting the array T.C=O(nlogn)
2-> count all three's elements occurence and then take a idx with the arr and go with each till count of 0,1,2 and put it into them 
3-> Dutch National Flag Algorithm : in this we make low, mid-1,mid,high, high+1, n-1
        - we put 0 from low to mid-1, we put 1 from mid-1 to mid but mid place element can be 0/1/2, from high+1 to n-1 we put 2
        - only the part from mid to high is unsorted 
        so for checking if a[mid] ==0 , then swap with low and increase its pointer, if a[mid]==1 just increment the mid pointer no need to swap
           - but if a[mid]==2 then we have to swap with the mid to high because from high+1 to n-1 is 2 so little bit high is shrink and became sorted 
           - ow decrease the high pointer 
*/
import java.util.*;
class SortColor{
  public static void sortColorBruit(int arr[]){
    // 1 -> sorting the array T.C=O(nlogn)
     Arrays.sort(arr);
     System.out.println(Arrays.toString(arr));
  }

  public static void sortColorBetter(int arr[]){
    // 2-> count all three's elements occurence and then take a idx with the arr and go with each till count of 0,1,2 and put it into them
    int count0=0;
    int count1=0;
    int count2=0;
    for(int i =0;i<arr.length;i++){
       if(arr[i]==0) count0++;
       if(arr[i]==1) count1++;
       if(arr[i]==2) count2++;
    }
    int idx =0;
    for(int i =0;i<count0;i++) arr[idx++] =0;
    for(int i =0;i<count1;i++) arr[idx++] =1;
    for(int i =0;i<count2;i++) arr[idx++] =2;
    System.out.println(Arrays.toString(arr));
  }


  /*
  Dutch National Flag Algorithm : in this we make low, mid-1,mid,high, high+1, n-1
        - we put 0 from low to mid-1, we put 1 from mid-1 to mid but mid place element can be 0/1/2, from high+1 to n-1 we put 2
        - only the part from mid to high is unsorted 
        so for checking if a[mid] ==0 , then swap with low and increase its pointer, if a[mid]==1 just increment the mid pointer no need to swap
           - but if a[mid]==2 then we have to swap with the mid to high because from high+1 to n-1 is 2 so little bit high is shrink and became sorted 
           - ow decrease the high pointer 
  */
  public static void sortColorBest(int arr[]){
     int low =0,mid =0, high = arr.length-1;
      while(mid<=high){
        if(arr[mid]==0){
          int temp = arr[low];
          arr[low]= arr[mid];
          arr[mid] = temp;
          low ++;
          mid++;
        }
        else if(arr[mid]==1){
          mid++;
      }
        else{
          int temp = arr[mid];
          arr[mid] = arr[high];
          arr[high] = temp;
          high--;
        }
      }
  }
  public static void main(String args[]){
    int arr[] = {0,1,0,2,0,1,2,0};
     sortColorBruit(arr);
     sortColorBetter(arr);
     sortColorBest(arr);
    }
}
