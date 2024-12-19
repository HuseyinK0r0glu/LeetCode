class Solution {
    public int[] findColumnWidth(int[][] grid) {

        int[] columnWidth = new int[grid[0].length];

        for(int j = 0; j < grid[0].length; j++) {
            int maxLength = 0;
            for(int i = 0; i < grid.length; i++) {
                int val = grid[i][j];
                if(val >= 0){
                    String temp = String.valueOf(val);
                    maxLength = Math.max(maxLength, temp.length());
                }else {
                    String temp = String.valueOf(val * -1);
                    maxLength = Math.max(maxLength, temp.length() + 1);
                }
            }
            columnWidth[j] = maxLength;
        }

        return columnWidth;
    }
}