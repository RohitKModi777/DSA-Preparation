import java.util.*;
class TripletSum{
  
  public static void main(String argss[]){
    
    int arr[] = {-1,0,1,2,1};
    //  We have to find those three element which sum will be equal to 0;
    // Bruit Force => T.C =O(N^3)

    for(int i =0;i<arr.length-2;i++){
       for(int j =i+1;j<arr.length-1;j++){
           for(int k =i+2;k<arr.length;k++){
                 if(arr[i] + arr[j] + arr[k] ==0){
                     System.out.println("Triplet sum :" + arr[i]+" "+arr[j]+" "+arr[k]);
                     break;
                 }
             }
          }
      }

    // Method 2 - sort the array and observer the pointer sum with while condition
    // T.C = O(N^2)
    Arrays.sort(arr);
        for(int i =0;i<arr.length-2;i++){
          int j = i+1;
          int k = j+1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum ==0){
                   System.out.println("Triplet Sum from which we got zero :" + arr[i] + " " + arr[j] + " " + arr[k]);  
                }
              j++;
              k--;
            }
          if(sum < 0)  j++;
          else k--;
         }
    }
}
