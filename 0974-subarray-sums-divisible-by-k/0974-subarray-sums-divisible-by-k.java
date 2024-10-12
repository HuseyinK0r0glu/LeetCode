class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int result = 0;
        int sum =0;
        
        int[] prefix = new int[nums.length+1];
        prefix[0] = 0;
        
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            prefix[i+1] = sum;
        }
        
        int count = 0;
        
        // remaining and how many of them
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<prefix.length;i++){
            
            int remaining = (prefix[i]);
            
            while(remaining < 0){
                remaining += k;
            }
            
            remaining = remaining % k;
            
            if(map.containsKey(remaining)){
                count += map.get(remaining);
                map.put(remaining,map.get(remaining) + 1); 
            }else {
                map.put(remaining,1);
            }
        }
        
        return count;
        
        
    }
}