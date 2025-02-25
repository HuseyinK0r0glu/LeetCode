class Solution {
    public int countPartitions(int[] nums) {

        int[] prefixSumRight = new int[nums.length];
        int[] prefixSumLeft = new int[nums.length];

        int sum = 0;

        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            prefixSumLeft[i] = sum;
        }

        sum = 0;

        for(int i = nums.length-1;i>=0;i--){
            sum += nums[i];
            prefixSumRight[i] = sum;
        }

        int count = 0;

        for(int i = 0;i<nums.length - 1;i++){
            int leftSubArray = prefixSumLeft[i];
            int rightSubArray = prefixSumRight[i] - nums[i];
            if((rightSubArray - leftSubArray) % 2 == 0){
                count++;
            }
        }

        return count;
    }
}