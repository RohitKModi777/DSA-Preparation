package Maths;

public class factorial {

    public static int facto(int a){
        if(a==0 ||a==1) return 1;
        return a*facto(a-1);
    }

    public static int fibo(int a){
        if(a==0) return 0;
        if(a==1) return 1;
        return fibo(a-1) + fibo(a-2);
    }
    public static void main(String[] args) {
        int num =5;
        int fact=1;
        for(int i=1;i<=num;i++){
          fact = fact *i; 
        }
        System.out.println(fact);

        System.out.println(facto(num));
        System.out.println(fibo(5));
    }
}
