class Solution {
    public int minimumOperations(int[] nums) {
        
        int total = nums.length;
        int canDivide = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            if(nums[i] % 3 == 0){
                canDivide++;
            }
        }
        
        return total - canDivide;
        
    }
}