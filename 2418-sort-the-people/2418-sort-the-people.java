class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int N = names.length;
        
        for(int i = 0;i<N;i++){
            
            int max = i;
            
            for(int j = i;j<N;j++){
                
                if(heights[j] > heights[max]){
                    max = j;
                }
                
            }
            
            int tempInt = heights[i];
            String temp = names[i];
            
            heights[i] = heights[max];
            names[i] = names[max];
            
            heights[max] = tempInt;
            names[max] = temp;
            
            
            
        }
        
        return names;
        
    }
}