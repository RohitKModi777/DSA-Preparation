class RevereArrbyDposition{

  // Method for rotation till d element and one by one shifting to the let then change last elemennt value with first one 
  // T.C = O(N^2)
  public static void RotateArrM1(int [] arr, int d)
  {
    int n = arr.length;
    for(int i =0;i<d;i++){
      int first = arr[0];
      for(int j =0;j<arr.length-1;j++){
        arr[j] = arr[j+1];
      }
      arr[n-1] = first;
    }
  }

  //  Using Rversal method with making small window with d size and and doing operation of rotating
  // T.C= O(N) approach
public static void ReversingM2(int arr[], int d){
    int n = arr.length;
  //  Doing rotation till d-1 position                
  /* 
  for example -> {1,2,3,4,5,6} => {2,1,3,4,5,6}  
    here 2,1 is the d rotaion 
  */
  reverseArr(arr,0,d-1);
  // reversing the remaining element window
  /*
   reversing remaining element 
    {2,1,3,4,5,6} => {2,1,6,5,4,3}
    {_,_,3,4,5,6} rotated
  */
  reverseArr(arr,d,n-1);
  // after this reversed full array
  /*
  full reversed of that complete above array
  {2,1,6,5,4,3} => {3,4,5,6,1,2}  
  that's the answer which we want 
  */
  reverseArr(arr,0,n-1);
}

public static void reverseArr(int arr[], int start, int end){
  while(start < end)
    {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
     }
}
  
  public static void main(String[] args){
    int arr[] ={1,2,3,4,5,6};
    int arr1[] ={1,2,3,4,5,6};
    int d =2;
    RotateArrM1(arr,d);
    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
      }

      System.out.println();

    ReversingM2(arr1,d);
     for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
      }
  }
}
