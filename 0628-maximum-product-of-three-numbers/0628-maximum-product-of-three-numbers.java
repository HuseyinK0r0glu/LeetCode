class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int first = nums[nums.length - 1] * nums[0] * nums[1];
        return Math.max(last, first);
    }
}