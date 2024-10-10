class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        int[] nextGreater = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            int value = nums[i];
            int max = -1;
            boolean foundInFirst = false;
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] > value){
                    foundInFirst = true;
                    max = nums[j];
                    break;
                }
            }
            
            
            if(!foundInFirst){
                for(int j = 0;j<i;j++){
                    if(nums[j] > value){
                        max = nums[j];
                        break;
                    }
                }
            }
            
            nextGreater[i] = max;
            continue;
        }
        
        return nextGreater;
        
    }
}