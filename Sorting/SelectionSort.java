/*Selection Sort: Repeatedly find the smallest element from the unsorted part and place it at the beginning.*/

/*Approach
Start from index i.
Find the minimum element in the remaining unsorted part.
Swap it with arr[i].
Repeat until the array is sorted.

in simple words take min element from array and swap with first element and next time from second first element so on... 
Time: O(n²) — Best, Average, Worst
Space: O(1) — In-place sorting
*/


import java.util.*;

public class Main {

    // Selection Sort: Find the minimum element
    // and place it at the correct position.
    static void SelectionSort(int arr[]) {

        // i represents the current position
        // where the minimum element should be placed
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume current element is minimum
            int minIdx = i;

            // Search for the minimum element
            // in the remaining unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                // If we find a smaller element,
                // update minIdx with its index
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the minimum element with arr[i]
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int arr[] = {15, 50, 97, 4};
        SelectionSort(arr);
    }
}
