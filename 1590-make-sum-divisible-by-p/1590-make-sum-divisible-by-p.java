class Solution {
    public int minSubarray(int[] nums, int p) {
        
        int totalSum = 0;
        
        for(int i = 0;i<nums.length;i++){
            totalSum = (totalSum + nums[i]) % p;
        }
        
        if(totalSum == 0){
            return 0;
        }
        
        int prefixSum = 0;
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        int minLen = nums.length;
        
        for(int i = 0;i<nums.length;i++){
            prefixSum = (prefixSum + nums[i]) % p;
            
            int target = (prefixSum - totalSum + p) % p;
            
            if(map.containsKey(target)){
                minLen = Math.min(minLen,i - map.get(target));
            }
            
            map.put(prefixSum,i);
            
        }
        
        return minLen == nums.length ? -1 : minLen;
    }
}