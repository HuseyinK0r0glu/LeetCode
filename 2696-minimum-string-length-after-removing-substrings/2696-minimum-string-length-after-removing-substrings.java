class Solution {
    public int minLength(String s) {
        
        for(int i = 0;i<s.length()-1;i++){
            if(s.substring(i,i+2).equals("AB") || s.substring(i,i+2).equals("CD")){
                return minLength(s.substring(0,i) + s.substring(i+2));
            }
        }
        
        return s.length();
        
    }
}