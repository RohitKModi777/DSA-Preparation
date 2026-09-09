/*
 Approach  
 -> Bruit Approach- taking each letter one by one in substring then when character is repeated then we mark that character as duplicateand break there then take the
    length of that window and return max of them.
*/

class Main {
    
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        String s ="abcabcbb";
        int ans =0;


      // Bruit Approach
        for(int i=0;i<s.length();i++){
            boolean seen[]= new boolean[256];   //due to ascii character size of boolean will be 256
            boolean duplicate = false;   // tak a flag for checking duplicates
            for(int j =i;j<s.length();j++){
                char ch = s.charAt(j);   // taking character
                if(seen[ch]){   //if seen
                    duplicate = true;   //change the flag of duplicate
                    break;  //break immediately
                }
                seen[ch] = true;
                if(!duplicate){    //if not duplicate
                    int length = j-i+1;    //taking length
                    ans = Math.max(ans,length);   //updating ans
                }
            }
        }
        System.out.println("Longest substring without repeating character"ans);   
    }
}
