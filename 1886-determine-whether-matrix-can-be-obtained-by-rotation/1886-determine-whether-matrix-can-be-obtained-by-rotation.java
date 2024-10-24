class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        // after 4 turn we will be in the same place 
        for(int k= 0;k<4;k++){
            int left = 0;
            int right = mat.length-1;
            while(left < right){
                
                for(int i = 0;i<right - left;i++){
                    
                    int top = left;
                    int bottom = right;
                    
                    // keep the value of the top left 
                    int temp = mat[top][left+i];
                    
                    // move bottom left to top left 
                    mat[top][left+i] = mat[bottom-i][left];
                    
                    // move bottom right to bottom left
                    mat[bottom-i][left] = mat[bottom][right-i];
                    
                    // move top right to bottom right 
                    mat[bottom][right-i] = mat[top+i][right];
                    
                    // put the val of top left to top right 
                    mat[top+i][right] = temp;
                }
                
                left++;
                right--;
            }
            
            if(check(mat,target))return true;
        }
        
        return false;
        
    }
    
    public boolean check(int[][] mat,int[][] target){
        
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        
        return true;
        
    }
    
}