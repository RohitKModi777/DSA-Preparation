public class twoSum {
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,1};
        int target = -1;
        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("true");
                    return;
                }
                else{
                    System.out.println("false");
                }
            }
        }
    }
}
