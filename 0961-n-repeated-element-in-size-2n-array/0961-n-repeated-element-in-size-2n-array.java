class Solution {
    public int repeatedNTimes(int[] nums) {
        
        // value and its frequency
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            map.put(nums[i],1 + map.getOrDefault(nums[i],0));
            
            if(map.get(nums[i]) == nums.length / 2) return nums[i]; 
            
        }
        
        return -1;
        
    }
}