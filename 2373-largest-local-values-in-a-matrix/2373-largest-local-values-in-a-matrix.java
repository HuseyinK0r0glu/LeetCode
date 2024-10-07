class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int[][] matrix = new int[grid.length-2][grid[0].length-2];
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                // find the max around the row i+1 col j+1
                int row = i+1;
                int col = j+1;
                int max = findMax(grid,row,col);
                matrix[i][j] = max;
            }
        }
        
        
        return matrix;
    }
    
    
    public int findMax(int[][] grid,int row,int col){
        
        int max = 0;
        
        for(int i=row-1;i<row+2;i++){
            for(int j=col-1;j<col+2;j++){
                if(grid[i][j] > max){
                    max = grid[i][j];
                }
            }
        }
        
        return max;
        
    }
}