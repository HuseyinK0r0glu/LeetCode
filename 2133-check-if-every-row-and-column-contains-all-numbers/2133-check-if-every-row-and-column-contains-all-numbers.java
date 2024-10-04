class Solution {
    public boolean checkValid(int[][] matrix) {
        
        // rows 
        for(int i = 0;i<matrix.length;i++){
            Set<Integer> setR = new HashSet<>();
            Set<Integer> setC = new HashSet<>();
            for(int j =0;j<matrix[0].length;j++){
                setR.add(matrix[i][j]);
                setC.add(matrix[j][i]);
            }
            
            if(!(setR.size() == matrix.length && setC.size() == matrix.length)){
                return false;
            }
        }
        
        return true;
        
    }
}