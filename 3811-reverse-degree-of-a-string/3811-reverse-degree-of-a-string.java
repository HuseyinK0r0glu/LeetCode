class Solution {
    public int reverseDegree(String s) {

        int value = 0;

        for(int i = 0;i < s.length(); i++){
            char c = s.charAt(i);
            value += (i+1) * (26 - (c - 'a'));
        }

        return value;
    }
}