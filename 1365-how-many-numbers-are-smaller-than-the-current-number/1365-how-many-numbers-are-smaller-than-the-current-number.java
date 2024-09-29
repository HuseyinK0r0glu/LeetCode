class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int N = nums.length;
        
        int[] result = new int[N];
        
        for(int i = 0;i<N;i++){
            
            int num = 0;
            
            for(int j = 0;j<N;j++){
                
                if(nums[j]<nums[i] && i != j){
                    num++;
                }
                
            }
            
            result[i] = num;
            
        }
        
        return result;
        
    }
}