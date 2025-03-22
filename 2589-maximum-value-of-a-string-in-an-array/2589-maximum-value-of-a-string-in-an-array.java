class Solution {
    public int maximumValue(String[] strs) {

        int max = 0;
        
        for(String s : strs) {
            max = Math.max(max,getValue(s));
        }
        
        return max;
    }
    
    public int getValue(String s){
        for(char ch : s.toCharArray()) {
            if(Character.isLetter(ch)) {
                return s.length();
            }
        }        
        return Integer.parseInt(s);
    }
}