/* 
Approach -2
Briuit - go till k then swap with the first element from last element with the size rotation of k   
T.C= O(N^2)
Best - go till k based on left right , reverse till 0 or n-1 , then reverse remaining element and then reverse full array 
T.C= O(N)
*/
import java.util.*;

class RotateArr {
    public static void rotateByKright(int arr[], int k) {
        int n = arr.length;   // Agar k array ki length se bada hai to extra rotations avoid karne ke liye k % n karenge
        k = k % n; 
        reverseArrBest(arr, 0, k - 1);   //First k elements ko reverse karo
        reverseArrBest(arr, k, n - 1);   // k se last element tak reverse karo
        reverseArrBest(arr, 0, n - 1);   // Pura array reverse karo Isse RIGHT rotation mil jayega
    }
    public static void rotateByKleft(int arr[], int k) {n
        int n = arr.length;
        k = k % n;
        reverseArrBest(arr, 0, n - 1);  // full array reverse 
        reverseArrBest(arr, 0, k - 1);  //first k elements reverse till k
        reverseArrBest(arr, k, n - 1);  // remaining element reverse get leftrotation
    }
  
    public static void reverseArrBest(int arr[], int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArrBruit(int arr[], int k) {
        int n = arr.length;
        for (int j = 0; j < k; j++) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }
    }
    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 1, 2, 3};
        int k = 2;
        rotateByKright(arr, k);
        System.out.println("Right Rotation: " + Arrays.toString(arr));
        rotateByKleft(arr, k);
        System.out.println("Left Rotation: " + Arrays.toString(arr));
        rotateArrBruit(arr, k);
        System.out.println("Rotation by Brute Force: " + Arrays.toString(arr));
    }
}
