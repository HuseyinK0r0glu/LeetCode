class Solution {
    public int countPartitions(int[] nums) {

        int total = 0;
        for(int num : nums){
            total += num;
        }

        int count = 0;
        int sum = 0;
        
        for(int i = 0;i<nums.length-1;i++){
            sum += nums[i];
            int rightSum = total - sum;
            
            if((rightSum - sum) % 2 == 0){
                count++;
            }
        }

        return count;
        
// WITH TWO PREFIX ARRAYS
//        int[] prefixSumRight = new int[nums.length];
//        int[] prefixSumLeft = new int[nums.length];
//
//        int sum = 0;
//
//        for(int i = 0;i<nums.length;i++){
//            sum += nums[i];
//            prefixSumLeft[i] = sum;
//        }
//
//        sum = 0;
//
//        for(int i = nums.length-1;i>=0;i--){
//            sum += nums[i];
//            prefixSumRight[i] = sum;
//        }
//
//        int count = 0;
//
//
//        for(int i = 0;i<nums.length - 1;i++){
//            int leftSubArray = prefixSumLeft[i];
//            int rightSubArray = prefixSumRight[i+1];
//            if((rightSubArray - leftSubArray) % 2 == 0){
//                count++;
//            }
//        }
//
//        return count;
    }
}