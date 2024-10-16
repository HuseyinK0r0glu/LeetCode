class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
     
        if(image == null || image.length == 0) return image;
        
        if(image[sr][sc] == color) return image;
        
        dfs(image,sr,sc,image[sr][sc],color);
        
        return image;
        
    }
    
    public void dfs(int[][] image,int i,int j,int original,int color){
        
        if(i<0 || j<0 || i>= image.length || j >= image[0].length) return;
        
        if(image[i][j] != original) return;
        
        image[i][j] = color;
        
        dfs(image,i+1,j,original,color);
        dfs(image,i-1,j,original,color);
        dfs(image,i,j-1,original,color);
        dfs(image,i,j+1,original,color);
    }
    
}