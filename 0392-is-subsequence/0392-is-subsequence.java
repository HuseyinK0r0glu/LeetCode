class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.isEmpty()) return true;

        int j = 0;

        for(int i = 0; i < t.length() && j < s.length() ; i++) {

            char targetChar = t.charAt(i);
            char sourceChar = s.charAt(j);

            if(targetChar == sourceChar) {
                j++;
            }
        }

        return j == s.length();
    }
}