class Solution {
    public int semiOrderedPermutation(int[] nums) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                x = i;
            }

            if(nums[i] == nums.length){
                y = i;
            }
        }

        if(x < y){
            return x + (nums.length - y - 1);
        }

        return x + nums.length - y - 2;
    }
}