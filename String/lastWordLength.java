class WordLength{
  
  public static int lastWlength(String str){
     int count =0;
     if(str.length()==0) return count;
     for(int i = str.length()-1;i>=0;i--){
       if(str.charAt(i)==' ') return count;
       count++;
     }
    return count;
  }
  
  public static void main(String args[]){
     String s = "Hello World";
     lastWlength(s);
  }
}
