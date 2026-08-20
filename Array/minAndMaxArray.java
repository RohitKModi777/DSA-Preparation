import java.util.*;

public class minAndMaxArray{
    public static ArrayList<Integer> minMaxElement(int[]arr){
        ArrayList <Integer> ls = new ArrayList<>();
        for(int a:arr){
            ls.add(a);
        }
        Collections.sort(ls);
        ArrayList<Integer> res = new ArrayList<>();
        res.add(ls.get(0));
        res.add(ls.get(ls.size()-1));
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,10,4,11,20,50,45};
        System.out.println(minMaxElement(arr));
    }
}