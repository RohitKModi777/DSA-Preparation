// same question as lc-q 930
/*
Approach - converting array into binary array
then counting the nice suarray which summ == k
simple thought we subtract lesser and equal to with the lesser data then we got those data which is equal to
*/

// Leetcode = Q-1248
class CNS{
  public static int ansSuba(int []nums,int k){
     int left =0;
     int nicesuba=0;
     int sum =0;

    for(int right =0;right<nums.length;right++){
        sum += nums[right];
      while(sum>k && left <=right){  //based on this condition we remove first and increase the pointer
          sum -=nums[left];
          left ++;
      }
      nicesuba += right-left+1; //getting total subarray count
    }
    return nicesuba;
  }
  public static void main(String []args){
    int arr[] = {1,1,2,1,1};
    int k =3;
    for(int i =0;i<arr.length;i++){
      arr[i] = arr[i] % 2 ; //it will make it as a binary array now we can use Binary subarray sum concept here
    }
    int ans = ansSuba(arr,k) - ansSuba(arr,k-1);
    System.out.println(ans);
  }
}
