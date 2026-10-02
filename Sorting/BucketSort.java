,/*
  Bucket Sort - we divide the array's element and store the element into certain buckets and then conquer the element in a sorted order
  bucket sort is not good where the data of the element is not uniform may be the bucket can be overflow
  for ex - {11,9,21,8,17,19,13,1,24,12,21,22} then store the elements in some buckets seperated with the range of elements
      => b1-> 1-5,b2-> 6-10, b3 -> 11-15, b4 -> 16-20, b5-> 21-25  now sort the elemnent of each bucket 
  atlast return the sorted order from the bucket in sorted oeder ans

  T.c =>  Best Case = O(n+k), Average Case = O(n+k), Worst Case =O(n^2)  {due to insertion sort in bucket}
  S.c => O(n+k)  {n = number of element , k= number of bucket }
*/

/*
Complete brief Explaination
  Bucket Sort

  Bucket Sort works by dividing the range of elements into multiple
  buckets. Each element is placed into its appropriate bucket.

  Then, we sort the elements inside each bucket and finally merge
  all the buckets in order to get the sorted array.

  Bucket Sort works well when the data is distributed relatively
  uniformly across the range.

  For example:

  arr = {11, 9, 21, 8, 17, 19, 13, 1, 24, 12, 21, 22}

  We can divide the range into buckets such as:

      b1 -> 1 - 5
      b2 -> 6 - 10
      b3 -> 11 - 15
      b4 -> 16 - 20
      b5 -> 21 - 25

  Then:

      b1 -> {1}
      b2 -> {8, 9}
      b3 -> {11, 12, 13}
      b4 -> {17, 19}
      b5 -> {21, 21, 22, 24}

  Now, sort the elements inside each bucket.

  Finally, merge the buckets from b1 to b5:

      {1, 8, 9, 11, 12, 13, 17, 19, 21, 21, 22, 24}

  This gives the final sorted array.
*/


import java.util.*;

class Main {

    public static void bucketSort(int[] arr) {
        int n = arr.length;
      
        // Find minimum and maximum value
        int minVal = Arrays.stream(arr).min().getAsInt();   //inbuilt function to get max and minimum element of the array
        int maxVal = Arrays.stream(arr).max().getAsInt();

        // Number of buckets
        int k = Math.max(1, n / 2);

        // Size/range of each bucket
        int bucketSize = Math.max(1, (maxVal - minVal) / k + 1);

        // Create buckets
        List<List<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            buckets.add(new ArrayList<>());
        }

        // Distribute elements into buckets
        for (int num : arr) {
            int idx = Math.min(
                k - 1,
                (num - minVal) / bucketSize
            );
            buckets.get(idx).add(num);
        }

        // Sort each bucket using insertion sort
        // and merge them back into the original array
        int pos = 0;

        for (List<Integer> bucket : buckets) {

            for (int i = 1; i < bucket.size(); i++) {

                int key = bucket.get(i);
                int j = i - 1;

                while (j >= 0 && bucket.get(j) > key) {
                    bucket.set(j + 1, bucket.get(j));
                    j--;
                }

                bucket.set(j + 1, key);
            }

            // Put sorted bucket elements back into arr
            for (int num : bucket) {
                arr[pos++] = num;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {11, 9, 21, 8, 17, 19, 13, 1, 24, 12, 21, 22};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
