// Question have to find the missing and repeated number from 1 to n^2(square) of the given grid 2D array
// Approach - > use frequency counter for this
import java.util.*;

class Number{
  public static void findMissingAndRepeatedValues(int grid[][]){
      int n = grid.length;
    // for taking the n^2 length we use n^2+1 bcoz it put from 0to n
     int freq[] = new int[n * n + 1];
     int res [] = new int[2];    // for tracking the array of 2 size using res array
     for(int arr[] : grid){   //it is 2d array so for iterating from 1 index of 2d array we have to use array iteration
       for(int val: arr){
          freq[val]++;    //increasing the counter based on the element of the array
       }
     }
    for(int i=1;i<=n*n;i++){
       if(freq[i]==2){  //checking the repeated element which freq>2 putting in 0th index
         res[0] = i;
       }
      else if(freq[i]==0){  //checking the repeated element which freq>2 putting in 0th index
         res[1] = i;
      }
    }
    System.out.println(Arrays.toString(res));
  }
    
  public static void main(String[]args){
    int arr[][] = {{1,3},{2,2}};
    findMissingAndRepeatedValues(arr);
  }
}
