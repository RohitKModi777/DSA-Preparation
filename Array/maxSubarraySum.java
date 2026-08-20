public class maxSubarraySum {
    public static void main(String[] args) {
        int arr[]= {2,3,-8,7,-1,2,3};
        int res = arr[0];

        for(int i =0;i<arr.length;i++){
            int currSum =0;
            for(int j =i;j<arr.length;j++){
                currSum = currSum+arr[j];
                res = Math.max(res,currSum);
            }
        }
        System.out.println(res);
    }
}
