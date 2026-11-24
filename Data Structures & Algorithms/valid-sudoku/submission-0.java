class Solution {
    public boolean isValidSudoku(char[][] board) {

     for(int i=0;i<9;i++){   //row iteration
        HashSet<Character> hs= new HashSet<>();
        for(int j=0;j<9;j++){
            if(hs.contains(board[i][j])){
                return false;
            }
            if(board[i][j]!='.'){
                hs.add(board[i][j]);
            }
        }
     }
     for(int i=0;i<9;i++){   //column iteration
        HashSet<Character> hs= new HashSet<>();
        for(int j=0;j<9;j++){
             if(hs.contains(board[j][i])){
                return false;
            }
            if(board[j][i]!='.'){
                hs.add(board[j][i]);
            }
        }
     }

     //box iteration
      for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                HashSet<Character> hs = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[row + i][col + j];
                        if (c != '.') {
                            if (hs.contains(c)) return false;
                            hs.add(c);
                        }
                    }
                }
            }
        }
     return true;
    }
}
