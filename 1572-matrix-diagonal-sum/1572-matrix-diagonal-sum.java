class Solution {
    public int diagonalSum(int[][] mat) {

        int result = 0;
        
        for(int i = 0;i<mat.length;i++){
            result += mat[i][i];
            result += mat[i][mat.length - 1 - i];
        }
        
        if(mat.length % 2 == 0){
            return result;
        }
        
        return result - mat[mat.length/2][mat.length/2];
        
    }
}