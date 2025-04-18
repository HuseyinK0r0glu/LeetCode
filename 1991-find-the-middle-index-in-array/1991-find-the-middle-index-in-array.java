class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int total = 0;
        int leftSum = 0;
        
        for(int i : nums){
            total += i;
        }
        
        for(int i =0;i<nums.length;i++){
            
            int rightSum = total - leftSum - nums[i];
            
            if(leftSum == rightSum){
                return i;
            }
            
            leftSum += nums[i];
        }
        
        return -1;
    }
}