class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while(left <= right){
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if(leftVal > rightVal){
                res[index--] = leftVal;
                left++;
            }else {
                res[index--] = rightVal;
                right--;
            }
        }
        return res;
    }
}