// Lettcode =724
/* Approach - we will use ls and rs as variable take total sum first tnen decrease it with rsum when left sum equals to right sum we will return index of that point */

class pi{
  public static int pivotIdx(int arr[]){
     int total =0;
     for(int n : arr){
        total +=n;
     }
     int lsum =0,rs;
     for(int i =0;i<arr.length;i++){
        rs = total - lsum-arr[i];
        if(lsum == rs) return i;
        else lsum += arr[i];
     }
    return -1;
  }
  public static void main(String[] args){
    int arr[] = {1,7,3,6,5,6};
    System.out.println(pivotIdx(arr));
  }
}
