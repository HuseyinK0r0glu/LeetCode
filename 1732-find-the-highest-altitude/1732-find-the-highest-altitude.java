class Solution {
    public int largestAltitude(int[] gain) {
        
        int[] heights = new int[gain.length];
        
        int sum = 0;
        
        for(int i = 0;i<gain.length;i++){
            sum += gain[i];
            heights[i] = sum;
        }
        
        Arrays.sort(heights);
        
        if(heights[heights.length-1] < 0){
            return 0;
        }
        
        return heights[heights.length-1];
        
    }
}