class Solution {
        public static int findLengthOfLCIS(int[] nums) {

            int prev = nums[0];
            int max = 1;
            int count = 1;

            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > prev) {
                    count++;
                }else {
                    max = Math.max(max, count);
                    count = 1;
                }
                prev = nums[i];
            }
            max = Math.max(max, count);
            return max;
        }
}