import java.util.*;

public class reverseArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of the array is: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        sc.close();

        int left =0;
        int right = n-1;

        while(left <right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right--;
        }
        System.out.print("Reversed array is :");
        System.out.println(Arrays.toString(arr));
    }
}