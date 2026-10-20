class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1; //minimum eating banana
        int right = Arrays.stream(piles).max().getAsInt(); //max range of pile which can be eat by koko

        while(left<right){
            int mid = left +(right-left)/2;
            int hrs=0;

            for(int p : piles)
            {
                hrs += (p+mid-1)/mid;  //ceiling division in java
            }
            if(hrs<=h){
                right = mid;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }

  public static void main(String [] args){
    int piles[] ={3,6,7,11};
    int h=8;
    System.out.println(minEatingSpeed(piles,h));
   }
}
