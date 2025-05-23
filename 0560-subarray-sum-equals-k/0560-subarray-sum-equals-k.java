class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        int prefix = 0;
        int res = 0;
        
        for(int num : nums){
            
            prefix += num;
            
            if(map.containsKey(prefix-k)){
                res += map.get(prefix-k);
            }
            
            map.put(prefix,map.getOrDefault(prefix,0)+1);
            
        }
        
        return res;
    }
}