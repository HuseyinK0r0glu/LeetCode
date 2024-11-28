class Solution {
    public static int maxPower(String s) {

        int max = 1;
        char current = s.charAt(0);
        int count = 0;

        for(int i = 0;i<s.length();i++) {
            if(current == s.charAt(i)) {
                count++;
            }else {
                max = Math.max(max, count);
                count = 1;
                current = s.charAt(i);
            }
        }
        max = Math.max(max, count);
        return max;
    }
    
}