class Solution {
    public int minBitFlips(int start, int goal) {
        
        if(goal > start){
            return getFlips(start,goal);
        }      
        
        return getFlips(goal,start);
    }
    
    public int getFlips(int first,int second){
        
        int count = 0;
        
        while(second > 0){
            int startBit = first & 1;
            int goalBit = second & 1;
            
            if(goalBit != startBit) count++;
            
            first = first >> 1;
            second = second >> 1;
        }
        
        return count;
        
    }
    
}