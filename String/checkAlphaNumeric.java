/*
 Check all values are only AlphaNumeric in a given String  don't use inbuilt methad isAlphaNumeric()
 for ex - a9H6 ->true  , a-b6 -not alphanumeric
*/
class CheckAN{
   public static boolean checkAlphaNumeric(String t){
        for(char a : t.toCharArray()){
            if(!(a>='a' && a<='z' || a>='A' && a<='Z' ||a>='0'&& a<='9')){   //condition for checking alphaNumeric or not
                return  false;
            }
        }
        return true;
    }
  
  public static void main(String args[]){
     String t ="a9H6";
     System.out.println("AlphaNumeric String : " + checkAlphaNumeric(t));
  }
}
