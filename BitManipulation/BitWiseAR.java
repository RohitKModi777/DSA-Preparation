// Leetcode - 201 we have to find the bitwise and of range number given in question inclusive range means last number is also included
/* 
we have to use here left shift and right shift  left shift means changeing the position of last digit 1=001 1<<1 =010
in right shift roughly half ho jata hai number 5>>1 =101 -> 2 =010
*/

/*
Approach
we do right shift both till not become 1's bit because when we git common in both then we will get the and bcoz 1 &1 is only 1 else 0, for reaching this result we have to left shift also with the index
 - left  → right shift
 - right → right shift
jab tak left == right
common part ko
wapis left shift karo
*/
class BAndR{
  public static int rangeBitNumber(int left , int right){
     int i =0;
      while(left !=right){
        left >> =1;
        right >>=1;
        i++;
      }
    return left <<i;
  }
  public static void main(String [] args){
    int left = 5;
    int right =7;
    System.out.println(rangeBitNumber(left,right));
  }
}
