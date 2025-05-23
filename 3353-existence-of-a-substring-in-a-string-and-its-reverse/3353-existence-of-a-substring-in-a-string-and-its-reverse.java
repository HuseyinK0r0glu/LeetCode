class Solution {
    public boolean isSubstringPresent(String s) {
        
        String reversed = new StringBuilder(s).reverse().toString();
        
        for(int i = 0;i<=s.length()-2;i++){
            if(reversed.contains(s.substring(i,i+2))){
                return true;
            }
        }
        
        return false;
    }
}