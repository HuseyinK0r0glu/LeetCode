class Solution {
    public int orangesRotting(int[][] grid) {
        
        // dfs
        Queue<int[]> q = new LinkedList<>();
        
        boolean noFound = true;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1) noFound = false;
            }
        }
        
        if(noFound) return 0;
        
        int count = 0;
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            for(int i = 0;i<n;i++){
                
                int[] temp = q.poll();
                
                int row = temp[0];
                int col = temp[1];
                
                if(row > 0 && grid[row-1][col] == 1){
                    grid[row-1][col] = 2;
                    q.offer(new int[]{row-1,col});
                }
                
                if(row < grid.length - 1 && grid[row+1][col] == 1){
                    grid[row+1][col] = 2;
                    q.offer(new int[]{row+1,col});
                }
                
                if(col > 0 && grid[row][col-1] == 1){
                    grid[row][col-1] = 2;
                    q.offer(new int[]{row,col-1});
                }
                
                if(col < grid[0].length -1 && grid[row][col+1] == 1){
                    grid[row][col+1] = 2;
                    q.offer(new int[]{row,col+1});
                }
            }
            count++;
        }
        count--;
        
        // check 
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == 1) return -1;
            }
        }
        
        return count;
    }
}