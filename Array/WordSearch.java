// LeetCode -79

/* 
Intution
- whenever character of word encounter with the board character , we start checking with it's all four direction and when encounter with the next character of it again check all four direction L,R,T,B
- after moving with the character match with the word's charcter just move ahead if it is not matching with the next character jus go previous and search for the next path means backtrack from it , 
- after moving from the previous character mark it as visited and by doing this we will reach the existed path 
*/


class WordSearch{
  public static void main(String[] args){
    char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','F'}};
    String word = "ABCFS";
    boolean ans = exist(board,word);
    System.out.println(ans);
  }

  public static boolean exist(char[][]board,String word){
      int row = board.length;
      int col = board[0].length;

     for(int i=0;i<row;i++){
       for(int j =0;j<col;j++){
         if(dfs(board,word,i,j,0)){
           return true;
         }
       }
     }
    return false;
  }

  public static boolean dfs(char[][] board, String word, int row, int col, int idx){
      if(idx == word.length()) return true;
      if(row<0 || col<0 || row>=board.length||col>=board[0].length||board[row][col] != word.charAt(idx)){
         return false;
      }
      char temp = board[row][col];
      board[row][col] = '#';

    boolean found = dfs(board,word,row+1,col,idx+1)||
      dfs(board,word,row-1,col,idx+1)||
      dfs(board,word,row+1,col,idx+1)||
      dfs(board,word,row,col-1,idx+1)||
      dfs(board,word,row,col+1,idx+1);
    board[row][col] = temp;
    return found;
  }
}
