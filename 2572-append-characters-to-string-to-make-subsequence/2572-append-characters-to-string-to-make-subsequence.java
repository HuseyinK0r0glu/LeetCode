class Solution {
    public int appendCharacters(String s, String t) {

        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                tIndex++;
            }else{
                sIndex++;
            }
        }
        
        return t.length() - tIndex;
        
    }
}