class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        
        int total = 0;
        
        for(int i = 0;i<grid2.length;i++){
            for(int j = 0;j<grid2[0].length;j++){
                if(grid2[i][j] == 1) {
                    List<int[]> list = new ArrayList<>();
                    dfs(grid1,grid2,i,j,list);
                    if(check(list,grid1)){
                        total++;
                    }
                }            
            }
        }
        
        return total;
    }
    
    public void dfs(int[][] grid1, int[][] grid2,int row,int col,List<int[]> list){
        
        if(row < 0 || row >= grid2.length || col < 0 || col >= grid2[0].length || grid2[row][col] != 1){
            return;
        }
        
        list.add(new int[]{row,col});
        
        grid2[row][col] = -1;
        
        dfs(grid1,grid2,row-1,col,list);
        dfs(grid1,grid2,row+1,col,list);
        dfs(grid1,grid2,row,col+1,list);
        dfs(grid1,grid2,row,col-1,list);
        
    }
    
    public boolean check(List<int[]> list,int[][] grid){
        
        for(int i = 0;i<list.size();i++){
            int row = list.get(i)[0];
            int col = list.get(i)[1];
            
            if(grid[row][col] != 1) return false;
            
        }
     
        return true;
    }
    
}