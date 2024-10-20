class Solution {
    
    private int total = 0; 
    
    public int totalNQueens(int n) {
        
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[n];
        
        String[][] matrix = new String[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = ".";
            }
        }
        
        findNQueens(matrix,rows,cols,n,0);
        
        return total;
        
    }
    
    public void findNQueens(String[][] matrix,boolean[] rows,boolean[] cols,int n,int row){
        
        if(row == n) {
            total++;
            return;
        }
        
        for(int j = 0;j<n;j++){
            
            if(check(matrix,n,row,j) && !rows[row] && !cols[j]){
                
                matrix[row][j] = "Q";
                rows[row] = true;
                cols[j] = true;
                
                findNQueens(matrix,rows,cols,n,row+1);
                
                matrix[row][j] = ".";
                rows[row] = false;
                cols[j] = false;
                
            }
            
        }
        
    }
    
    public boolean check(String[][] matrix,int n,int r,int c){
        
        // original values
        int x = r;
        int y = c;
        
        r--;
        c--;
        // top left 
        while(r>=0 && c>=0){
            if(matrix[r][c].equals("Q")) return false;
            r--;
            c--;
        }
        
        r = x;
        c = y;
        
        r++;
        c++;
        // bottom right 
        while(r<n && c<n){
            if(matrix[r][c].equals("Q")) return false;
            r++;
            c++;
        }
        
        r = x;
        c = y;
        
        r++;
        c--;
        // bottom left 
        while(c>=0 && r<n){
            if(matrix[r][c].equals("Q")) return false;
            r++;
            c--;
        }
        
        r = x;
        c = y;
        
        r--;
        c++;
        while(c<n && r>=0){
            if(matrix[r][c].equals("Q")) return false;
            r--;
            c++;
        }
        
        return true;
    }
    
    
}