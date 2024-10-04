class Solution {
    public void solveSudoku(char[][] board) {

        solve(board);
         
    }
    
    public boolean solve(char[][] board){
        
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == '.'){
                    for(char num = '1' ; num <= '9';num++){
                        if(checkForColumn(board,j,num) && checkForRow(board,i,num) && checkForCell(board,i,j,num)){
                            
                            board[i][j] = num;
                            
                            if(solve(board)){
                                return true;
                            }
                            
                            board[i][j] = '.';
                            
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public boolean checkForColumn(char[][] board,int j,int num){
        
        for(int i = 0;i<board.length;i++){
            if(board[i][j] == num){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkForRow(char[][] board,int i,int num){
        for(int j = 0;j<board[0].length;j++){
            if(board[i][j] == num){
                return false;        
            }
        }
        return true;
    }
    
    public boolean checkForCell(char[][] board,int i,int j,int num){
        
        int row = 0;
        int col = 0;
        
        if(i/3 == 0){
            row = 0;
        }else if(i / 3 == 1){
            row = 3;
        }else {
            row = 6;
        }
        
        
        if(j / 3 == 0){
            col = 0;
        }else if(j / 3 == 1){
            col = 3;
        }else {
            col = 6;
        }
        
        
        for(int k = row;k<row+3;k++){
            for(int m = col;m<col+3;m++){
                if(board[k][m] == num){
                    return false;
                }
            }
        }
        
        return true;
    }
}