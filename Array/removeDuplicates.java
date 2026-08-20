import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,5};
        int res [] = new int[arr.length];
        int idxres = 0;

        for(int i=0;i<arr.length;i++){
            boolean dup = false;
            for(int j =0;j<idxres;j++){
                if(arr[i] == res[j]){
                    dup=true;
                    break;
                }
            }
            if(!dup){
               res[idxres]=arr[i];
               idxres++;
            }
        }
        for(int m=0;m<idxres;m++){
            System.out.print(res[m]+" ");
        }


        HashSet <Integer> s = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
            }
        }
        System.out.print("Unique elements: "+ s);
    }
}
