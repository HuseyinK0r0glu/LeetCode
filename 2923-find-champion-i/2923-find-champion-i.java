class Solution {
    public static int findChampion(int[][] grid) {

        for(int i = 0;i<grid.length;i++) {
            int zeroCount = 0;
            for(int j = 0;j<grid[0].length;j++) {
                if(grid[i][j]==0) {
                    zeroCount++;
                }
                if(zeroCount > 1) break;
            }

            if(zeroCount == 1) return i;

        }

        return -1;
    }
}