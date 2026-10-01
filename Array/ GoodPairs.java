//Nice pairs : Nice pairs are those pairs which is equal and i<j for example : {1,2,3,1,1,3}  pairs=(0,3)(0,4)(2,5)(4,5) here i<j nums[i]==nums[j]
/*
Approaches
Bruit - crete a tracker of count iterate over array and take each element one by one and check with other element if it is equal and its index is smaller than next one then increase the count and at last return the count
   -T.C =O(N^2)
   -S.C =O(1)
Better Approach - nc2 as we know that the pair can make through the 2 combination of the same element so we do by this like make an hashamp count teh frequency of each element then iterate over teh frequency if it has pairs then return the count of that pairs.
   -T.C =O(N)
   -S.C =O(N)
Optimal Approach - create a freq array of 101 based on queston array's size given and then do for each loop if that element come in counts element not previously just add that occurence if not come previous if it has come just update teh freq and add the answer updated every time for the clarity check the below code.
   -T.C =O(N)
   -S.C =O(1)
*/
class NGP{
  public static int nicepairs(int[] nums){
     int ans =0;
     int count [] = new int[101];
     for(int num : nums){
       ans += count[num]++;
     }
    return ans;
  }
  public static void main(String[] args){
    int arr[] = {1,2,3,1,1,3};
    System.out.println(nicepairs(arr));
  }
}
