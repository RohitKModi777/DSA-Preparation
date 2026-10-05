/*
Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.
Approach
 -Start with the second element as the first element is assumed to be sorted.
 -Compare the second element with the first if the second is smaller then swap them.
 -Move to the third element, compare it with the first two, and put it in its correct position
 -Repeat until the entire array is sorted.
*/

class IS{
  public static void insertionSort(int arr[]){
     int n = arr.length;
     for(int i =1;i<n;i++){
       int key = arr[i];
       int j = i-1;

    /* Move elements of arr[0..i-1], that are  greater than key, to one position ahead  of their current position */
       while(j>=0 && arr[j]>key){
         arr[j+1] = arr[j];
          j = j-1;
       }
       arr[j+1] = key;
     }
    System.out.println(Arrays.toString(arr));
  }
  
  public static void main(String[] args){
    int arr[] ={9,4,13,2,5};
    insertionSort(arr);   
  }
  
}
