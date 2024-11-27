class Solution {
    public static int minimumArea(int[][] grid) {

        int leastRow = grid.length;
        int maxRow = 0;
        int leastCol = grid[0].length;
        int maxCol = 0;

        for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j<grid[0].length;j++) {
                if(grid[i][j] == 1){
                    leastRow = Math.min(leastRow,i);
                    maxRow = Math.max(maxRow,i);
                    leastCol = Math.min(leastCol,j);
                    maxCol = Math.max(maxCol,j);
                }
            }
        }
        return (maxRow - leastRow + 1) * (maxCol - leastCol + 1);
    }
}