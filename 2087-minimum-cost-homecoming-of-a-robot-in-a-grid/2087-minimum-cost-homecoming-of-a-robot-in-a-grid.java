class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        
        int startRow = startPos[0];
        int startCol = startPos[1];
        
        int homeRow = homePos[0];
        int homeCol = homePos[1];
        
        int total = 0;
        
        if(homeRow > startRow){
            for(int i = startRow + 1;i<=homeRow;i++){
                total += rowCosts[i];
            }
        }else {
            for(int i = startRow- 1;i>=homeRow;i--){
                total += rowCosts[i];
            }
        }
        
        if(homeCol > startCol){
            for(int i = startCol + 1;i<=homeCol;i++){
                total += colCosts[i];
            }
        }else {
            for(int i = startCol - 1;i>=homeCol;i--){
                total += colCosts[i];
            }
        }
        
        return total;
        
    }
}
