class Solution {
    public int countBattleships(char[][] board) {
        
        int total = 0;
        
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[i].length;j++){
                if(board[i][j] == 'X') {
                    dfs(board,i,j);
                    total++;
                }
            }
        }
        
        return total;
        
    }
    
    public void dfs(char[][] board,int row,int col){
        
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length) return;
            
        
        if(board[row][col] == '.') return;
        
        board[row][col] = '.';
        
        dfs(board,row+1,col);
        dfs(board,row-1,col);
        dfs(board,row,col+1);
        dfs(board,row,col-1);
        
    }
    
}