class Solution {
    public int maxSum(int[][] grid) {

        long max = 0;

        for(int i = 1 ; i < grid.length - 1 ; i++){
            for(int j = 1 ; j < grid[i].length - 1 ; j++){
                long current =  grid[i][j] + grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1]
                        + grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                max = Math.max(max, current);
            }
        }

        return (int)max;
    }
}