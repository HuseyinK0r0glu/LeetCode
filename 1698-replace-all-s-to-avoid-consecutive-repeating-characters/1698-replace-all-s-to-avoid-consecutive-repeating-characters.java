class Solution {
    public String modifyString(String s) {

        char[] chars = s.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0;i<chars.length;i++) {
            if(chars[i] == '?') {
                for(char c : alphabet) {
                    if((i > 0 && chars[i-1] == c) || (i < s.length() - 1 && chars[i+1] == c)) {
                        continue;
                    }
                    chars[i] = c;
                    break;
                }
            }
        }
        return new String(chars);
    }
}