package String;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "ekegs";
        
        if (s1.length() !=s2.length()){
            System.out.println("false");
        }

        char[] arr1= s1.toCharArray();
        char[] arr2= s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
