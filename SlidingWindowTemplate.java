class SlidingWindow{

  // for fixedSizeWindow - ADD → CHECK → REMOVE
  public static void fixedSizeWidow(int arr[]){
    int sum = 0;
    int ans = 0;
    for(int i = 0; i < arr.length; i++) {
      sum += arr[i];   // Current element window me add karo // Jab window size k ho jaye
      if(i >= k - 1) {  // Jab window size k ho jaye
        ans = Math.max(ans, sum);  // Answer update karo
        sum -= arr[i - k + 1];    // Window ka first element hatao
    }
}
    // ADD → CONDITION CHECK → SHRINK → ANSWER
    public static int VariableSizeWindow(int arr[]){
      int left = 0;
      int sum = 0;
      int ans = 0;
      for(int right = 0; right < arr.length; right++) {
        sum += arr[right];   // Right wala element add karo
        while(sum > target) {     // Jab condition kharab ho jaye  
        sum -= arr[left];    // Left wala element hatao 
        left++;   // Left ko aage badhao
    }
    ans = Math.max(ans, right - left + 1);   // Ab current valid window ka answer check karo
    }
  }
    
  public static void main(String args[]){
    int arr [] ={};
    int k;
    fixedSizeWindow(arr, k);
    variableSizeWindow(int arr[]);
  }
}
