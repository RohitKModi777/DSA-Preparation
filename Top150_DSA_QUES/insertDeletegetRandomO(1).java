/*Leetcode -380   {Insert Delete and GetRandom Number with O(1) complexity}*/
/*
Thinking and Intution 
  -for inserting deleting and getrandom number in hashset -> O(1) , O(1) and O(n)  for deletion in hashset we can do but what if the number is after that it contains undique element make problem in deletion and we have to find that index also 
  -Now HashMap Insertion , Deletion  and get number - O(1), O(1), O(N) -> because you have to get that index then give that number
  -ArrayList - Insetion -O(1), Deletion can be O(1) for last and for except last O(N) and for get Numebr it is O(1)
  so combine and synced HashMap + ArrayList
*/

// use Random class of java make sure the object of Random should be with the Random keyword


class RandomizedSet{
  ArrayList<Integer> ls ;
  HashMap<Integer,Integer> map;
  Random random = new Random();
  
  public RandomizedSet(){
    // initialising the constructor
     map = new HashMap<Integer,Integer>();
     ls = new ArrayList<Integer>();
  }

  public boolean insert(int val){
     if(map.containsKey(val)) return false;   //checking value already present
     ls.add(val);   //adding into the list 
     map.put(val,ls.size()-1);   //value with the index
     return true; 
  }

  public boolean delete(int val){
    if(!map.containsKey(val)) return false;  //if not present then how to delete the number
    int index = map.get(val);   //index storing of val
    int last = ls.get(ls.size()-1);   //during swaping it lose the index so we have to store it
    ls.set(index,last);   //swapping the deleted with the last element
    map.put(last,index);   //updating the maping of index with that value
    ls.remove(ls.size()-1);   //removing from the last
    map.remove(val);  //removing from the map
    return true;
  }

  public int getRadom(){
     int randomNum = random.nextInt(ls.size());   //getting the random number from the list using random class with tehmethod nextInt
     return ls.get(randomNum);   //getting the random number and returning that number 
  }
}
