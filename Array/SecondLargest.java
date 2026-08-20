import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={12,35,1,10,34};  //if unique element
        int arr1[]={12,35,1,10,34,1};  //if unique element
        Arrays.sort(arr);
        int m = arr.length;
        int n = arr1.length;
        System.out.println("Second Largest element:" + arr[m-2]);
        
        Arrays.sort(arr1);
        for(int i=n-2;i>=0;i--){
            if(arr1[i]!=arr1[n-1]){
                System.out.print(arr1[i] + " ");
                return;
            }
            else{
                System.out.println(-1);
            }
        }
        // System.out.println("Second Largest element:" + arr1);
    }
}
