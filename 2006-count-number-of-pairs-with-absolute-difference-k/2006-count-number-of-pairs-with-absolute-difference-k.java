class Solution {
    public int countKDifference(int[] nums, int k) {
        /*
        // brute force 
        int res = 0;
        
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(Math.abs(nums[i] - nums[j]) == k) res++;
            }
        }
        
        return res;
        */
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int res = 0;
        
        for(int i = 0;i<nums.length;i++){
            
            res += map.getOrDefault(nums[i] - k,0);
            res += map.getOrDefault(nums[i] + k,0);
            
            map.put(nums[i] ,map.getOrDefault(nums[i] ,0)+1);
        }
        
        return res;
    }
}