class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        int N = nums.length;
        
        if(N == 2 || N == 1){
            return -1;
        }
        
        for(int i = 0;i<N;i++){
            
            int min=i;
            
            for(int j = i+1;j<N;j++){
                
                if(nums[j] > nums[min]){
                    min = j;
                }
                
            }
            
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        
        
        return nums[1];
        
    }
}