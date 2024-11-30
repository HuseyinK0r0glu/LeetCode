class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int maxDecreasing = 1;
        int maxIncreasing = 1;

        int decreasing = 1;
        int increasing = 1;

        for(int i = 1; i < nums.length; i++) {

            if(nums[i] > nums[i-1]) {
                increasing++;
                decreasing = 1;
            }else if (nums[i] < nums[i-1]){
                decreasing++;
                increasing = 1;
            }else {
                increasing = 1;
                decreasing = 1;
            }
            maxIncreasing = Math.max(maxIncreasing, increasing);
            maxDecreasing = Math.max(maxDecreasing, decreasing);
        }
        
        return Math.max(maxIncreasing, maxDecreasing);

    }
}