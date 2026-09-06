// Question - Write a java program to find most frequent character in string

import java.util.*;
class MostFC{
  public static void mostfreqchar(String st){
      int freq[] = new int[26];
    
      for(int i =0;i<st.length();i++){
          freq[st.charAt(i)-97]++;  //unicode of a=97 so 97-97=0
      }

      int idx =0; //taking the track of that  index
      int max = freq[0];   //checking the maximum element
      for(int i =1;i<freq.length;i++){
          if(freq[i]>max){
              max = freq[i];
              idx =i;
          }
      }
      Character ch = (char)('a' +idx);   // typecasting to character and getting with unicode
      System.out.println(ch);
  }
  public static void main(String[] args){
    String s="abcdaabc";
    mostfreqchar(s);
  }
}
