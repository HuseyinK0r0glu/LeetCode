class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int total = 0;
        
        for(int i = 0;i<grid2.length;i++){
            for(int j = 0;j<grid2[0].length;j++){
                if(grid2[i][j] == 1) {
                    if(dfs(grid1,grid2,i,j)){
                        total++;
                    }
                }            
            }
        }
        
        return total;
    }
    
    public boolean dfs(int[][] grid1, int[][] grid2,int row,int col){
        
        if(row < 0 || row >= grid2.length || col < 0 || col >= grid2[0].length || grid2[row][col] != 1){
            return true;
        }
        
        grid2[row][col] = -1;
        
        boolean isSubIsland = grid1[row][col] == 1;

        isSubIsland &= dfs(grid1, grid2, row - 1, col);
        isSubIsland &= dfs(grid1, grid2, row + 1, col);
        isSubIsland &= dfs(grid1, grid2, row, col - 1);
        isSubIsland &= dfs(grid1, grid2, row, col + 1);
        
        return isSubIsland;
        
    }
    
    // we can put the cells in a list and then check
    public boolean check(List<int[]> list,int[][] grid){
        
        for(int i = 0;i<list.size();i++){
            int row = list.get(i)[0];
            int col = list.get(i)[1];
            
            if(grid[row][col] != 1) return false;
            
        }
     
        return true;
    }
    
}