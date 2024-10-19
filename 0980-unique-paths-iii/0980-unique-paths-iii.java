class Solution {
    public int uniquePathsIII(int[][] grid) {
    
        int startX = 0;
        int startY = 0;
        int walkable = 0;
        
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                
                if(grid[i][j] == 1){
                    startX = i;
                    startY = j;
                }else if(grid[i][j] == 0){
                    walkable++;
                }
                
            }
        }
        
        return dfs(grid,startX,startY,walkable);
        
        
    }
    
    public int dfs(int[][] grid,int x,int y,int walkable){
        
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1) return 0;
        
        if(grid[x][y] == 2){
            if(walkable == -1) return 1;
            else return 0;
        }
        
        walkable--;
       
        int temp = grid[x][y];
        grid[x][y] = -1;
        
        int total = dfs(grid,x-1,y,walkable) + dfs(grid,x+1,y,walkable) + dfs(grid,x,y-1,walkable)              + dfs(grid,x,y+1,walkable);
        
        grid[x][y] = temp; 
        
        return total;
        
    }
    
}