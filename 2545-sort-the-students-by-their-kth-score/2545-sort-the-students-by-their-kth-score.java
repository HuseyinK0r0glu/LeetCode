class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
     
    
        for(int i = 0;i<score.length;i++){
            
            int max = i;
            
            for(int j = i +1 ;j<score.length;j++){
                
                if(score[j][k] > score[max][k]){
                    
                    max = j;
                    
                }
                
            }
            
            
            int[] temp = score[i];
            score[i] = score[max];
            score[max] = temp;
            
        }
        
        return score;
        
    }
}