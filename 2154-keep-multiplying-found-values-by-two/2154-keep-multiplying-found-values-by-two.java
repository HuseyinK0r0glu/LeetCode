class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        int N = nums.length;
        
        boolean found = true;
        
        while(found){
            
            boolean originalFound = false;
            
            for(int i = 0;i<N;i++){
                if(nums[i] == original){
                    original = original * 2;
                    originalFound = true;
                    break;
                }    
            }
            
            if(!originalFound){
                found = false;
            }
            
        }
        

        return original;
        
    }
}