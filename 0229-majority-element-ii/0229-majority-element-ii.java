class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        // bayer moore algorithm
        List<Integer> list = new ArrayList<>();
        
        Map<Integer,Integer> count = new HashMap<>();
        
        for(int num : nums){
            
            count.put(num,count.getOrDefault(num,0)+1);
            
            if(count.size() <= 2) continue;
                
            Map<Integer,Integer> temp = new HashMap<>();
            
            for(int key : count.keySet()){
                if(count.get(key) > 1) temp.put(key,count.get(key)-1);
            }
            
            count = temp;
        }
        
        for(int key : count.keySet()){
            int c = 0;
            for(int num : nums){
                if(num == key) c++;
            }
            
            if(c > Math.floor(nums.length/3)) list.add(key);
            
        }
        
        return list;
        
        
        /*
        // hashmap
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int key : map.keySet()){
            
            if(map.get(key) > Math.floor(nums.length/3)) list.add(key);
            
        }
        
        return list;
        */
    }
}