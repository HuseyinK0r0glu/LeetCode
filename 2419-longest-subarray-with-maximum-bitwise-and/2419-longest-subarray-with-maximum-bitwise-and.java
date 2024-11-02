class Solution {
    public int longestSubarray(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
        }
        
        int longest = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            if(nums[i] == max){
                int total = 0;
                while(i < nums.length && nums[i] == max){
                    total++;
                    i++;
                }
                longest = Math.max(longest,total);
            }
            
        }
        
        return longest;
        
    }
}