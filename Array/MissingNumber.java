// Approach 3 
/*
1-{natural number iteration and check missing one },  
2- {getting the sum of array of i and then sum of natural number then subtract teh natural number with the array numbers} 
3- {xor operator}
*/
class MissingNumber{

  public static void findmissBruit(int arr[]){
      for(int j = 1; j <= arr.length; j++) {
         int flag = 0;
         for(int i = 0; i < arr.length; i++) {
           if(arr[i] == j) {
            flag = 1;
            break;
           }
         }
        if(flag == 0) {
           System.out.println("Missing number: " + j);
            break;
           }
      }
  }

  public static void findmissBetter(int arr[]){
       int sum =0;
        for(int i =0;i<arr.length;i++){
           sum += arr[i];
        }
        int res =0;
        for(int i =1;i<=6;i++){
            res += i;
        }
        int ans = res-sum;
        System.out.println(ans);
  }

  public static void findmissBest(int arr[]){
      int Xor =0, Xor1=0;
        for(int i =0;i<arr.length;i++){
            Xor = Xor^(i+1);
            Xor1 = Xor1^arr[i];
        }
        Xor1 ^= (arr.length+1);
        int ans = Xor ^ Xor1;
        System.out.println(ans);
  }
  
  public static void main(String [] args){
    int arr[] = {1,2,3,5,6};
    findmissBruit(arr);
    findmissBetter(arr);
    findmissBest(arr);
  }
