class Solution {
    public long[] findPrefixScore(int[] nums) {
        
        long[] score = new long[nums.length];

        long max = Integer.MIN_VALUE;
        long sumForScore = 0;

        for(int i = 0; i < nums.length; i++) {
            long val = nums[i];
            max = Math.max(max, val);
            sumForScore = sumForScore + val + max;
            score[i] = sumForScore;
        }

        return score;
    }
}