class Solution {
    
    private Set<List<String>> set = new HashSet<>();
    
    public List<List<String>> solveNQueens(int n) {
        
        // create col and row matrices to hold boolean values if we have a queen in that 
        boolean[] rows = new boolean[n];
        boolean[] columns = new boolean[n];
        
        // fill the matrix
        String[][] matrix = new String[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = ".";
            }
        }
        
        findNQueens(matrix,rows,columns,n,0);
        
        return new ArrayList<>(set);
    }
    
    public void findNQueens(String[][] matrix,boolean[] rows,boolean[] columns,int n,int row){
        
        if(row == n){
            addList(matrix,n);
            return;
        }
        
        for(int j = 0;j<n;j++){
            
            if(check(matrix,rows,columns,n,row,j) && !rows[row] && !columns[j]){
                matrix[row][j] = "Q";
                rows[row] = true;
                columns[j] = true;
                
                findNQueens(matrix,rows,columns,n,row+1);
                
                matrix[row][j] = ".";
                rows[row] = false;
                columns[j] = false;
            }
        }
    }
    
    public void addList(String[][] matrix,int n){
        List<String> temp = new ArrayList<>();
        for(int i = 0;i<n;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<n;j++){
                sb.append(matrix[i][j]);
            }
            temp.add(sb.toString());
        }
        set.add(temp);
    }
    
    public boolean check(String[][] matrix,boolean[] rows,boolean[] columns,int n,int i,int j){
        
        // original values
        int x = i;
        int y = j;
        
        i--;
        j--;
        
        // left top
        while(i>=0 && j>=0){
            if(matrix[i][j].equals("Q")) return false;
            i--;
            j--;
        }
        
        // bottom right 
        i = x;
        j = y;
        
        i++;
        j++;
        
        while(i<n && j<n){
            if(matrix[i][j].equals("Q")) return false;
            i++;
            j++;
        }
        
        // top right 
        
        i = x;
        j = y;
        
        i--;
        j++;
        
        while(i>=0 && j<n){
            if(matrix[i][j].equals("Q")) return false;
            i--;
            j++;
        }
        
        // left bottom
        
        i = x;
        j = y;
        
        i++;
        j--;
        
        while(i<n && j>=0){
            if(matrix[i][j].equals("Q")) return false;
            i++;
            j--;
        }
        
        return true;   
    }
}