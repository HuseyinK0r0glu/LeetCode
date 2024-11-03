class Solution {
    public boolean rotateString(String s, String goal) {
        
        int length = s.length();
        while(length > 0){
            
            if(s.equals(goal)) return true;
            
            s = s.substring(1,s.length()) + s.charAt(0);
            
            length--;
        }
     
        return false;
        
    }
}