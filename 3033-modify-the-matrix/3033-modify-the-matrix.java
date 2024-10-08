class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        
        int[][] resultMatrix = new int[matrix.length][matrix[0].length];
        
        for(int j = 0;j<matrix[0].length;j++){
            
            int max = 0;
            
            for(int i = 0;i<matrix.length;i++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
            
            for(int i = 0;i<matrix.length;i++){
                if(matrix[i][j] == -1){
                    resultMatrix[i][j] = max;
                }else {
                    resultMatrix[i][j] = matrix[i][j];
                }
            }
        }
        
        
        return resultMatrix;
    }
}