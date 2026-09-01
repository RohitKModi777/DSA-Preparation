//  Simple Observation koi bhi number ki power wo tabhi hoga tab tak hum us digit se divide karte rhe jab tak remainder us digit ko divide karte zero nhi aa jata
// agar remainder zero means that number is the power of that number
class PowerOf3{
  publlic static boolean pow3(int a)
  {
    if(n==0 || n<0) return false;
    while(a%3==0)
      {
        n/=3;
      }
    return n==1;
  }
  
  publlic static boolean pow2(int a)
  {
    if(n==0 || n<0) return false;
    while(a%2==0)
      {
        n/=2;
      }
    return n==1;
  }
  
  publlic static boolean pow4(int a)
  {
    if(n==0 || n<0) return false;
    while(a%4==0)
      {
        n/=4;
      }
    return n==1;
  }
  
  public static void main(String args[]){
    int n =27;
    pow3(n);
    pow2(n);
    pow4(n);
  }
}
