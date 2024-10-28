class Solution {
    public boolean judgeCircle(String moves) {
        
        int horizantal = 0;
        int vertical = 0;
        
        for(char c : moves.toCharArray()){
            if(c == 'U') vertical++;
            else if(c == 'D') vertical--;
            else if(c == 'L') horizantal--;
            else horizantal++;
        }
        
        return horizantal == 0 && vertical == 0;
        
    }
}