class Solution {
    
    private int total = 0;
    private boolean reached = false;
    
    public int numEnclaves(int[][] grid) {
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    int res = dfs(grid,i,j);
                    if(!reached){
                        total += res;
                    }
                    reached = false;
                }
            }
        }
        
        return total;
        
    }
    
    public int dfs(int[][] grid,int row,int col){
        
        if(row<0 || col<0 || row>=grid.length || col>= grid[0].length || grid[row][col] != 1 ) return 0;
        
        // if we reach to the boundary we set reached true        
        if(row == 0 || col == 0 || col == grid[0].length-1 || row == grid.length -1){
            reached = true;
        }
        
        grid[row][col] = -1;
        
        return 1 + dfs(grid,row+1,col) + dfs(grid,row-1,col) + dfs(grid,row,col-1) + dfs(grid,row,col+1);
        
    }
    
}