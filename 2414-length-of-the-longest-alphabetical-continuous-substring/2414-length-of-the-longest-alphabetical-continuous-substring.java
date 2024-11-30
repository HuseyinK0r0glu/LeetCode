class Solution {
    public int longestContinuousSubstring(String s) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int length = 1;

        for(int i = 0;i<alphabet.length();i++){
            for(int j = i+1;j<alphabet.length();j++){
                if(s.contains(alphabet.substring(i,j+1))){
                    length = Math.max(length,j-i+1);
                }
            }
        }
        
        return length;
    }
}