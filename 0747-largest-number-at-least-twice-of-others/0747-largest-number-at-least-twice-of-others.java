class Solution {
    public int dominantIndex(int[] nums) {
        
        int N = nums.length;
        
        int max = 0;
        int maxIndex = 0;
        
        for(int i=0;i<N;i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        
        for(int i=0;i<N;i++){
            
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
        

        
        
        if(nums[N-1] >= nums[N-2]*2){
            return maxIndex;
        }
        return -1;
        
    }
}