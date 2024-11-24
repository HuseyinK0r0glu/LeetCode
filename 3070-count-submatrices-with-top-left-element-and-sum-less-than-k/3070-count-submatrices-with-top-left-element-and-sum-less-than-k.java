class Solution {
    public static int countSubmatrices(int[][] grid, int k) {

        int[][] prefix = new int[grid.length][grid[0].length];

        prefix[0][0] = grid[0][0];

        int count = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(i == 0 && j == 0) continue;
                prefix[i][j] += grid[i][j];
                if(i > 0) prefix[i][j] += prefix[i-1][j];
                if(j > 0) prefix[i][j] += prefix[i][j-1];
                if(i > 0 && j > 0) prefix[i][j] -= prefix[i-1][j-1];
            }
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(prefix[i][j] <= k) count++;
            }
        }

        return count;
    }
}