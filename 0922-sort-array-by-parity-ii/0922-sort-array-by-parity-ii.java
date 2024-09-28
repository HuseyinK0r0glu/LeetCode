class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int N = nums.length;
        
        for(int i = 0;i<N;i = i+2){
            
            if(nums[i] % 2 != 0){
                
                for(int j = 1;j<N;j = j+2){
                    
                    if(nums[j] % 2 == 0){
                        
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        
                        break;
                    }
                }
                
            }            
        }

        return nums;
    }
}