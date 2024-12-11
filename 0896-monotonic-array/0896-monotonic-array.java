class Solution {
    public static boolean isMonotonic(int[] nums) {

        boolean isDecreasing = true;
        boolean isIncreasing = true;

        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                isDecreasing = false;
            }

            if(nums[i] > nums[i+1]){
                isIncreasing = false;
            }
        }

        return isDecreasing || isIncreasing;
    }
}