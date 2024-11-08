class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        
        int[] res = new int[nums.length];
        int prefix = 0;
        int max = (1 << maximumBit) -1;
        
        for(int num : nums){
            prefix ^= num; 
        }
        
        for(int i = 0;i<nums.length;i++){
            res[i] = max ^ prefix;
            prefix = prefix ^ nums[nums.length-i-1];
        }
        
        return res;
    }
}