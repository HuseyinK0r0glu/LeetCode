class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        if(check(board) && checkCell(board)){
            return true;
        }

        return false;
        
    }
    
    public boolean check(char[][] board){
        
        for(int i = 0;i<board.length;i++){
            Map<Character,Integer> mapR = new HashMap<>();
            Map<Character,Integer> mapC = new HashMap<>();
            for(int j = 0;j<board.length;j++){
                if(board[i][j] != '.' && mapR.containsKey(board[i][j])){
                    return false;
                }
                
                if(board[j][i] != '.' && mapC.containsKey(board[j][i])){
                    return false;
                }
                mapR.put(board[i][j] , 1);
                mapC.put(board[j][i] , 1);
            }
        }
        
        return true;
    }
    
    public boolean checkCell(char[][] board){
        
        for(int i = 0;i<board.length;i += 3){
            for(int j = 0;j<board.length;j += 3){
                
                int row = (i / 3) * 3;
                int col = (j / 3) * 3;
                
                Map<Character,Integer> map = new HashMap<>();
                
                for(int k = row;k<row+3;k++){
                    for(int m = col;m<col+3;m++){
                        if(board[k][m] != '.' && map.containsKey(board[k][m])){
                            return false;
                        }
                        map.put(board[k][m],1);
                    }
                }
                
            }
        }
        
        
        return true;
    }
    
}