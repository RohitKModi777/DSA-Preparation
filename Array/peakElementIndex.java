// Leetcode -882 (We have to do it in O(logn))
// Q- you have to return that element which is peak element in an array of mountain like elemnts for ex -[1,2,3,4,,2,1]
/*
   Approach 1- without log n we will go to that element which next element is smaller
   we use an idx then go till arr[ele]<arr[ele+1] we increase idx++ at last return it
   Approach -2 for making it in O(logn) we use binary search with two pointer we track teh element if teh element is on mid just update high then low and high will be pointing the same low breaks and will return low element
*/

class peakElement{
  public static int peakEleidxM1(int [] arr){
       int i =0;
       while(arr[i]<arr[i+1]){
         i++;
      }
    return i;
  }
  
  public static int peakEleidxM2(int [] arr){
     int low =0;
     int high = arr.length-1;
     int mid;

    while(low<high){
       mid = low + (high-low)/2;
       if(arr[mid]<arr[mid+1]){
          low =mid+1;
       }
       else{
          high = mid;
       }
    }
    return low;
  }
  
  public static void main(String[] args){
    int arr[] = {0,1,0};
    int ans = peakEleidxM1(arr);
    System.out.println(ans);
    System.out.println(peakEleidxM2(arr));
  }
}
