class Solution {
    public int findMaxFish(int[][] grid) {
        
        int max = 0;
        
        for(int i =0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] != 0){
                    max = Math.max(max,dfs(grid,i,j));
                }
            }
        }
        
        return max;
        
    }
    
    public int dfs(int[][] grid,int i,int j){
        
        if(i<0 || j< 0 || i>= grid.length || j>= grid[0].length || grid[i][j] == 0) return 0;
        
        int fish = grid[i][j];
        
        grid[i][j] = 0;
        
        return fish + dfs(grid,i-1,j) + dfs(grid,i+1,j) + dfs(grid,i,j-1) + dfs(grid,i,j+1);
        
    }
}