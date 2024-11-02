class Solution {
    
    private int total = 0;
    
    public int countMaxOrSubsets(int[] nums) {
        
        int maxOr = 0;
        for(int num : nums){
            maxOr |= num;
        }
        
        backtrack(nums,maxOr,0,0);
        return total;
    }
    
    public void backtrack(int[] nums,int maxOr,int current,int index){
        
        if(current == maxOr) total++; 
        
        for(int i = index;i<nums.length;i++){
            int original = current;
            current |= nums[i];
            backtrack(nums,maxOr,current,i+1);
            current = original;
        }
        
    }
    
}