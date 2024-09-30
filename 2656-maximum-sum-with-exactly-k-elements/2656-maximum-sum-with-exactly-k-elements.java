class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        for(int i = 0;i<nums.length-1;i++){
            
            boolean swapped = false;
            
            for(int j = 0;j<nums.length-i-1;j++){
                
                if(nums[j] > nums[j+1]){
                    
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                    
                }
                
            }
            
            if(!swapped){
                break;
            }
            
        }
        
        int max = nums[nums.length - 1];
        int result = 0;
        
        for(int i = 1;i<=k;i++){
            
            result += max;
            max++;
        }
        
        return result;
        
    }
}