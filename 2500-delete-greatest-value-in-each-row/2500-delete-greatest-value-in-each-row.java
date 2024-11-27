class Solution {
    public static int deleteGreatestValue(int[][] grid) {

        int total = 0;

        for(int k = 0; k < grid[0].length; k++) {
            int tempRowValue = Integer.MIN_VALUE;
            for(int i = 0;i<grid.length;i++) {
                int value = 0;
                int lastRow = 0;
                int lastCol = 0;
                for(int j = 0;j<grid[0].length;j++) {
                    if(grid[i][j] > value) {
                        value = grid[i][j];
                        lastRow = i;
                        lastCol = j;
                    }
                }
                grid[lastRow][lastCol] = -1;
                tempRowValue = Math.max(tempRowValue,value);
            }
            total += tempRowValue;
        }
        return total;
    }
}