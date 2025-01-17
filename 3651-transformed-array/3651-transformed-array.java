class Solution {
    public int[] constructTransformedArray(int[] nums) {

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int value = nums[i];

            if(value == 0){
                result[i] = nums[i];
            }else if(value > 0){
                int index = (i + value) % nums.length;
                result[i] = nums[index];
            }else {
                int index = ((i + value) % nums.length + nums.length) % nums.length;
                result[i] = nums[index];
            }
        }

        return result;
    }

}