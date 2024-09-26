class Solution {
    public int[] numberGame(int[] nums) {
        
        int N = nums.length;
        
        for(int i = 0;i<N;i++){
            
            int min = i;
            
            for(int j = i+1;j<N;j++){
                
                if(nums[j] < nums[min]){
                    min = j;
                }
                
            }
            
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
            
        }
        
        for(int i = 0;i<N;i=i+2){
            
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            
        }
        
        return nums;
        
    }
}