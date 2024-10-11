class Solution {
    public int findClosestNumber(int[] nums) {
        
        int closest = 0;
        int range = Integer.MAX_VALUE;
        
        for(int num : nums){
            
            if(Math.abs(num) < range){
                range = Math.abs(num-0);
                closest = num;
            }else if(Math.abs(num) == range){
                if(num > closest){
                    closest = num;
                }
            }
            
        }
        
        return closest;
        
    }
}