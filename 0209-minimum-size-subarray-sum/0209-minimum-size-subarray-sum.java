class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int[] prefix = new int[nums.length+1];
        prefix[0] = 0;
        
        int sum = 0;
        
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            prefix[i+1] = sum;
        }
        
        int left = 0;
        int right = 0;
        
        int minLength = Integer.MAX_VALUE;
        
        while(left < prefix.length && right < prefix.length){
            
            if(prefix[right] - prefix[left] >= target){
                minLength = Math.min(right-left,minLength);
                left++;
            }else if(prefix[right] - prefix[left] < target){
                right++;
            }
        }
        
        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        
        return minLength;
        
    }
}