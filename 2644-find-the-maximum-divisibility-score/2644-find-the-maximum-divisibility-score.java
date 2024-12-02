class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {

        int maxDivScore = -1;
        int maxDiv = 0;

        Arrays.sort(divisors);

        for(int i = 0;i<divisors.length;i++) {
            int total = 0;
            for(int j = 0;j<nums.length;j++) {
                if(nums[j] % divisors[i] == 0) {
                    total++;
                }
            }
            if(total > maxDivScore) {
                maxDivScore = total;
                maxDiv = divisors[i];
            }
        }
        return maxDiv;
    }
}