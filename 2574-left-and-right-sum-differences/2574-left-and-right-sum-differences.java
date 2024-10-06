class Solution {
    public int[] leftRightDifference(int[] nums) {
     
        int[] result = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            
            int leftSum = 0;
            int rightSum = 0;
            
            for(int j=0;j<=i-1;j++){
                leftSum += nums[j];
            }
            
            for(int k =i+1;k<=nums.length-1;k++){
                rightSum += nums[k];
            }
            
            result[i] = Math.abs(leftSum - rightSum);
                
        }
        
        return result;
        
    }
}