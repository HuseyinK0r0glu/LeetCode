class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = Integer.MIN_VALUE;
        int total = 0;

        for(int i = 0;i<nums.length;i++) {
            if(nums[i]==1) {
                total++;
                max = Math.max(max,total);
            }else {
                total = 0;
            }
        }

        if(max == Integer.MIN_VALUE) return 0;

        return max;
    }
}