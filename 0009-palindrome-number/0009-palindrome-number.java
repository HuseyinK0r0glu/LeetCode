class Solution {
    public boolean isPalindrome(int x) {
        int total = 0;
        int y = x;
        if(x < 0){
            return false;
        }
        
        while (y!= 0){
            total = total * 10 + y % 10;
            y = y / 10;
        }
        
        if(total == x){
            return true;
        }
        return false;
    }
}