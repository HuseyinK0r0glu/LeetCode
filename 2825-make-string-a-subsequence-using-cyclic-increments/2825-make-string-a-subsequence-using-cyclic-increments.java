class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {

        int j = 0;

        for(int i = 0; i < str1.length() && j < str2.length(); i++) {
            if(str2.charAt(j) == str1.charAt(i) || str2.charAt(j) == (str1.charAt(i) + 1 - 'a') % 26 + 'a') {
                j++;
            }
        }

        return j == str2.length();
    }
}