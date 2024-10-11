class Solution {
    public int removeDuplicates(int[] nums) {
        
        int left = 0;
        
        for(int right=0;right<nums.length;right++){
            
            if(right == 0){
                nums[left] = nums[right];
                left++;
                continue;
            }
            
            if(nums[right] != nums[right-1]){
                nums[left] = nums[right];
                left++;
            }
        }
        
        return left;
        
    }
}