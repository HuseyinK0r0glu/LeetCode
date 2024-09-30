class Solution {
    public int minElement(int[] nums) {
        
        int min = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            int temp = 0;
            
            while(nums[i] > 0){
                
                temp += nums[i] % 10;
                nums[i] = nums[i] / 10;
                
            }
            
            nums[i] = temp;
            
            if(i == 0){
                min = nums[i];
            }
            
            if(nums[i] < min){
                min = nums[i];
            }
        }
        
        
        return min;
        
    }
}