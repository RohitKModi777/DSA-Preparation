// comparing adjacent element and swap with the smallest one 
// smallest one will be in the left and greater number will be in the right
import java.util.*;
class BubbleSort{
  public static void main(String args[]){
    int arr[] ={5,2,4,3,1};
    for(int i =0;i<arr.length-1;i++){
       for(int j = 0;j<arr.length-1-i;j++){
         if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
         }
       }
    }
    System.out.println("Sorted Array using BubbleSort: "+ Arrays.toString(arr));

  }
}
