class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int max = 0;
        int count0 = 0;
        int count1 = 0;

        for(int i = 0;i < s.length();i++) {

            if(s.charAt(i) == '0') {
                if(count1 > 0){
                    count0 = 0;
                }
                count1 = 0;
                count0++;
            }else {
                count1++;
            }
            
            max = Math.max(max, 2 * Math.min(count0, count1));
            
        }
        return max;
    }
}