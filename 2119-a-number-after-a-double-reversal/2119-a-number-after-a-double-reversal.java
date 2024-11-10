class Solution {
    public boolean isSameAfterReversals(int num) {
        
        String s = String.valueOf(num);
        
        
        if(s.length() == 1) return true;
        if(s.charAt(s.length()-1) == '0') return false; 
        
        return true;
    }
}