class Solution {
    public static int minFlips(int[][] grid) {

        int rows = 0;
        int cols = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length/2; j++) {
                if(grid[i][j] != grid[i][grid[0].length-1-j]) {
                    rows++;
                }
            }
        }

        for(int j = 0; j < grid[0].length; j++) {
            for(int i = 0; i < grid.length /2; i++) {
                if(grid[i][j] != grid[grid.length-1-i][j]) {
                    cols++;
                }
            }
        }
        return Math.min(rows, cols);
    }
}