class NeighborSum {

    public int[][] grid;
    
    public NeighborSum(int[][] arr) {
        grid = new int[arr.length][arr[0].length]; 
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                grid[i][j] = arr[i][j];
            }
        }
    }
    
    public int adjacentSum(int value) {
        int row = 0;
        int col = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == value){
                    row = i;
                    col = j;
                }
            }
        }
        
        int sum = 0;
        
        if(row>0) sum+= grid[row-1][col];
        if(row<grid.length-1) sum += grid[row+1][col];
        if(col>0) sum+= grid[row][col-1];
        if(col<grid[0].length-1) sum += grid[row][col+1];
        
        return sum;
        
    }
    
    public int diagonalSum(int value) {
        
        int row = 0;
        int col = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j] == value){
                    row = i;
                    col = j;
                }
            }
        }
        
        int sum = 0;
        
        if(row > 0 && col > 0) sum += grid[row-1][col-1];
        if(row > 0 && col < grid[0].length-1) sum += grid[row-1][col+1];
        if(row < grid.length-1 && col > 0) sum += grid[row+1][col-1];
        if(row < grid.length-1 && col < grid[0].length-1) sum += grid[row+1][col+1]; 
        
        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */