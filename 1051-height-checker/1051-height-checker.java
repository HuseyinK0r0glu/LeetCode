class Solution {
    public int heightChecker(int[] heights) {
        
        int N = heights.length;
        int[] array = new int[N];
        
        for(int i = 0;i<N;i++){
            
            array[i] = heights[i];
            
        }
        
        for(int i = 0;i<N;i++){
            
            int min = i;
            
            for(int j = i+1;j<N;j++){
                
                if(heights[j] < heights[min]){
                    
                    min = j;
                    
                }
                
            } 
            
            int temp = heights[i];
            heights[i] = heights[min];
            heights[min] = temp;
            
        }
        
            int matched = 0;
    
    
        for(int i = 0;i<N;i++){
            if(heights[i] != array[i]){
                matched++;
            }
        }
    
        return matched;
    }
}
    
    
