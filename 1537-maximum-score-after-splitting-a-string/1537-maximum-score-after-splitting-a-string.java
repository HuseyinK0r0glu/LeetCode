class Solution {
    public static int maxScore(String s) {

        int[] prefix = new int[s.length()];
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
            prefix[i] = count;
        }

        int maxScore = 0;

        for(int i = 1; i < s.length(); i++) {
            maxScore = Math.max(maxScore,i - prefix[i-1] + prefix[prefix.length-1] - prefix[i-1]);
        }
        return maxScore;
    }
}