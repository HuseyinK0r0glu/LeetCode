class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int[][]  grid = new int[image.length][image[0].length];

        for(int i = 0; i < grid.length; i++) {
            int index = 0;
            for(int j = grid[i].length - 1; j >= 0; j--) {
                grid[i][index++] = image[i][j];
            }
        }

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 1) {
                    grid[i][j] = 0;
                }else {
                    grid[i][j] = 1;
                }
            }
        }

        return grid;

    }
}