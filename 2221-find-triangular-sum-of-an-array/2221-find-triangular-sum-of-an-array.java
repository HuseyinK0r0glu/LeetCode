class Solution {
    public static int triangularSum(int[] nums) {

        while(nums.length > 1) {
            int[] temp = new int[nums.length-1];
            for(int i = 1;i<nums.length;i++) {
                temp[i-1] = (nums[i-1] + nums[i]) % 10;
            }
            nums = temp;
        }

        return nums[0];
    }
}