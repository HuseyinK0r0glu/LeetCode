class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        int[][] diff = new int[n][m];
        
        int[] rows = new int[n];
        int[] cols = new int[m];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        
    
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                diff[i][j] = rows[i] + cols[j] - (n-rows[i]) - (m-cols[j]);
            }
        }
        
        return diff;
    }
}