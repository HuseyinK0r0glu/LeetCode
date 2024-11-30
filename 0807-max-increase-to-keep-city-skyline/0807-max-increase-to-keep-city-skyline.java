class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int[] rows = new int[grid.length];
        int[] cols = new int[grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            int max = 0;
            for(int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, grid[i][j]);
            }
            rows[i] = max;
        }

        for(int j = 0; j < grid[0].length; j++) {
            int max = 0;
            for(int i = 0; i < grid.length; i++) {
                max = Math.max(max, grid[i][j]);
            }
            cols[j] = max;
        }

        int total = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                total += Math.min(rows[i], cols[j]) - grid[i][j];
            }
        }
        return total;
    }
}