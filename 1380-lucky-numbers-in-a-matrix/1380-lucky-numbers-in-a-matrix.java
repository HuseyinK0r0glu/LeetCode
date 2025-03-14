class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        
        for(int i = 0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<matrix[0].length;j++){
                min = Math.min(min,matrix[i][j]);
            }
            rows[i] = min;
        }
        
        for(int i = 0;i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<matrix.length;j++){
                max = Math.max(max,matrix[j][i]);
            }
            cols[i] = max;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(rows[i] == matrix[i][j] && cols[j] == matrix[i][j]){
                    list.add(matrix[i][j]);
                }
            }
        }
        
        return list;
    }
}