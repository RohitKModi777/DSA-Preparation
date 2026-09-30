// In this sorting we use pivot element as a central element and putting small on the left and larger on the right 
/*
 Step-1 => find pivot element
 Step=2 => by swapping change the position of the smallest and largest element based on the pivot element
 Step=3 => return the sorted array
*/
import java.util.*;
class QuickSort{
  public static void qsort(int[] arr, int low, int high){
    if(low>= high) return;  //getting single element {base condition}
    int pivotidx = partition(arr,low,high);
    qsort(arr,low,pivotidx-1);
    qsort(arr,pivotidx+1,high);
  }

  public static int partition(int arr[], int low, int high){
    int pivotEle =arr[high];  //just supposing the last element as pivot
    int start =-1; //we are not taking 0 bcoz when we do post increment it will go to first index instead of zero
    for(int i =low;i<high;i++){
      if(arr[i]<=pivotEle){
        start++;
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
      }
    }
      start++; //because after the loop we get the just second elemnt of start as a pivot central element
      int temp = arr[high];
      arr[high] = arr[start];
      arr[start] = temp;
    return start;
}
  public static void main(String [] args){
      int arr[] = {4,3,6,5};
      int low =0;
      int high=arr.length-1;
      qsort(arr,low,high);
      System.out.println(Arrays.toString(arr));
  }
}
