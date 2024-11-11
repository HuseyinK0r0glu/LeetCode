class Solution {
    public boolean checkString(String s) {
        
        for(int i = 0;i<s.length();i++){
            if(s.substring(0,i+1).contains("ba")) return false;
        }
        
        return true;
    }
}