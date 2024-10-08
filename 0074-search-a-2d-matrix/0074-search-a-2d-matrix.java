class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        
        int columnNumber = matrix[0].length;
        
        while(left <= right){
            int mid = (left + right) / 2;
            int row = mid/columnNumber;
            int col = mid%columnNumber;
            
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        
        // if we can't find the target 
        return false;
    }
}