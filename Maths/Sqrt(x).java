// Leetcode -69   - use long or do log typecasting  also when you multiply mid to get x because it exceed teh limit of int 
/*Observation - the sqroot will be less than x only can't be greater then x and sqrt can't be 0 sot it should be start from 1*/
/* Approach - as we know that the multiple of that number two times will be equal to sqare of the ans */

class Sq{
  public static int findSqrt(int x){
     int st =1;
     int end = x;
    while(st<=end){
      int mid = st + (end-st)/2;
      if(mid*mid == end) return mid;   // end can be change with x when it exceed teh limit of int while multiplying
      else if(mid*mid>x) end = mid-1;
      else st = mid+1;
    }
    return end;
  }
      
  public static void main(String [] args){
    int num =49;
    System.out.println(findSqrt(num));
  }
}
