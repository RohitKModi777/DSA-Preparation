package String;

public class palindromeString {
    public static void main(String[] args) {
        String s = "abba";
        StringBuilder str = new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }

        if(s.equals(str.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
