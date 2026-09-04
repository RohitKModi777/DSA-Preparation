import java.util.*;

class QuestionsPractice {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
// Question -1 create an array of natural number return an arraylist of even numbder  from the given array
        int arr[] ={1,2,3,4,5,6,7,8};
        ArrayList <Integer> ls = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i] %2==0){
                ls.add(arr[i]);
            }
        }
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i) + " ");
        }
        
// Question -2 create an array of names and find the most occurence name using HashMap
        String names[] = {"raj","karan","mohit","raj","karan","raj"};
        HashMap<String,Integer> map = new HashMap<>();
        String assumeStr ="";

        for(String str : names){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        for(String key : map.keySet()){
            if(map.get(key)>map.getOrDefault(assumeStr,0)){
                assumeStr  = key;
            }
        }
            System.out.println(assumeStr);
        
// Question -3 create an array of numbers and find the unique numbers using hashset
        int arr1[] = {1,2,1,3,4,5,-1,-3,2,1,4};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        int uniq[] = new int[set.size()];
        int idx =0;
        for(int a : set){
            uniq[idx++] =a;
        }
            System.out.print(Arrays.toString(uniq));
    }
}
