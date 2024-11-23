class Solution {
    public static char[][] rotateTheBox(char[][] box) {

        char[][] grid = new char[box[0].length][box.length];

        for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j<grid[0].length;j++) {
                grid[i][j] = box[box.length-1-j][i];
            }
        }

        for(int j = 0;j<grid[0].length;j++) {

            int empty = grid.length - 1;

            for(int i = grid.length-1;i>=0;i--) {

                if(grid[i][j] == '#'){
                    grid[i][j] = '.';
                    grid[empty][j] = '#';
                    empty--;
                }else if (grid[i][j] == '*'){
                    empty = i - 1;
                }
            }
        }
        return grid;
    }
}