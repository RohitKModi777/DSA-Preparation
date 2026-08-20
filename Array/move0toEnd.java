public class move0toEnd {
    public static void main(String[] args) {
        int arr[] ={1,0,2,0,3,0,4,5,6};
        int n = arr.length;
        int temp[] = new int[n];
        int idxtmp =0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[idxtmp++]=arr[i];
            }
        }
        while(idxtmp<n){
            temp[idxtmp++] =0;
        }
        for(int i =0;i<n;i++){
            arr[i] = temp[i];
        }

        for(int j : arr){
            System.out.print(j+" ");
        }
    }
}
