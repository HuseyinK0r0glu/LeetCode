class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int count = 0;
        int left = 0;
        int right = 0;
        
        for(char c : moves.toCharArray()){
            if(c == 'L') left++;
            else if(c == 'R') right++;
            else count++;
        }
        
        return Math.abs(right - left) + count;
        
    }
}