class Solution {
    public int singleNumber(int[] nums) {
        
        int xor = 0;
        
        // key is number value is appear value
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i = 0;i<nums.length;i++){
            
            int key = nums[i];
            
            if(map.get(key) == null){
                map.put(key,1);
            }else {
                int value = map.get(key);
                map.put(key,value+1);
            }
            
            
            if((map.get(key) == 1) || (map.get(key) == 2)){
                
               xor = xor ^ nums[i];
               
            } 
            
        }

        return xor;
        
    }
}