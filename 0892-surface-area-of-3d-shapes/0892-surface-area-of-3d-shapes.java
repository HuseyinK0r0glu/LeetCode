class Solution {
    public int surfaceArea(int[][] grid) {
        int total = 0;

        int extras = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    total += 2;
                }
                if(i == 0){
                    total += grid[i][j];
                }else {
                    extras += Math.abs(grid[i][j] - grid[i-1][j]);
                }
                if(i == grid.length - 1) {
                    total += grid[i][j];
                }else {
                    extras += Math.abs(grid[i][j] - grid[i+1][j]);
                }
                if(j == 0){
                    total += grid[i][j];
                }else {
                    extras += Math.abs(grid[i][j] - grid[i][j-1]);
                }
                if(j == grid[0].length - 1){
                    total += grid[i][j];
                }else {
                    extras += Math.abs(grid[i][j] - grid[i][j+1]);
                }
            }
        }
        return total +  extras/2;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna