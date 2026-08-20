public class missingNumber {
    public static void main(String[] args) {
        int arr[]={8,2,4,5,3,7,1};
        
        long n = arr.length+1;
        long sum =0;

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }

        long expSum = n *(n+1)/2;
        System.out.println((int) expSum-sum);
    }
}
