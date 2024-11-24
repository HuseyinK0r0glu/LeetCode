class Solution {
    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        List<List<Integer>> list = new ArrayList<>();

        int[][] grid = new int[8][8];

        int row = king[0];
        int col = king[1];

        // queens
        for(int i = 0;i<queens.length;i++){
            grid[queens[i][0]][queens[i][1]] = 2;
        }

        // check directions


        int tempCol = col;
        while(tempCol >= 0){
            if(grid[row][tempCol--] == 2){
                list.add(Arrays.asList(row, tempCol+1));
                break;
            }
        }
        tempCol = col;

        while(tempCol < 8){
            if(grid[row][tempCol++] == 2){
                list.add(Arrays.asList(row, tempCol-1));
                break;
            }
        }
        int tempRow = row;
        while(tempRow >= 0){
            if(grid[tempRow--][col] == 2){
                list.add(Arrays.asList(tempRow+1, col));
                break;
            }
        }

        tempRow = row;
        while(tempRow < 8){
            if(grid[tempRow++][col] == 2){
                list.add(Arrays.asList(tempRow-1, col));
                break;
            }
        }

        tempCol = col;
        tempRow = row;
        while(tempCol >= 0 && tempRow >= 0){
            if(grid[tempRow--][tempCol--] == 2){
                list.add(Arrays.asList(tempRow+1, tempCol+1));
                break;
            }
        }
        tempCol = col;
        tempRow = row;
        while(tempCol >= 0 && tempRow < 8){
            if(grid[tempRow++][tempCol--] == 2){
                list.add(Arrays.asList(tempRow-1, tempCol+1));
                break;
            }
        }

        tempCol = col;
        tempRow = row;
        while(tempCol < 8 && tempRow < 8){
            if(grid[tempRow++][tempCol++] == 2){
                list.add(Arrays.asList(tempRow - 1, tempCol - 1));
                break;
            }
        }
        tempCol = col;
        tempRow = row;
        while(tempCol < 8 && tempRow >= 0){
            if(grid[tempRow--][tempCol++] == 2){
                list.add(Arrays.asList(tempRow + 1, tempCol - 1));
                break;
            }
        }

        return list;
    }
}