// Quest - combined two sorted array in single array (Leetcode -88)
/*
Approach -  we take an array of m++n length array in which 0<m size array will be added first in merged array tehn iterate from second given array till n then add from mto n elemnt into merged array
    --then sort the merged array , and print that array according to the question
*/
import java.util.*;
class MergeArrays{
  public static void main(String [] args){
     int arr1[] = {1,3,5,0,0,0};
     int arr2[] = {3,4,5};
     int m = 3;
     int n = 3;
     int merged[] = new int[m+n];

    for(int i =0;i<m;i++){
      merged[i] = arr1[i];
    }
    
    for(int i =0;i<n;i++){
      merged[m+i] = arr2[i];
    }
    Arrays.sort(merged);
    // we have to print the arr1 of m+n length with the sorted array element
    for(int i =0;i<m+n;i++){
       arr1[i] = merged[i];
    }
    System.out.println(Arrays.toString(arr1));
  }
}
