package String;

public class reverseString {
    public static void main(String[] args) {
        String s ="Dev";
        int left = 0;
        int right = s.length()-1;

        StringBuilder str = new StringBuilder(s);
        StringBuilder str1 = new StringBuilder(s);
        
        // Swapping method with two pointer
        while(left<right){
            char temp = str.charAt(left);
            str.setCharAt(left,str.charAt(right));
            str.setCharAt(right, temp);
            left ++;
            right--;
        }
        System.out.println("Reversed String: "+str);

        for(int i = s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        System.out.println(str1.toString());
    }
}
