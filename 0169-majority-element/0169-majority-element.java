class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            
            map.put(num,map.getOrDefault(num,0) + 1);
            
            if(map.get(num) > nums.length / 2){
                return num;
            }
            
        }
        
        return -1;
        
        /*
        Map<Integer,Integer> map = new HashMap<>();

        for(int i : nums){
            if (contain(i,map)){
                int value = map.get(i);
                value++;
                map.put(i,value);
            }else {
                map.put(i,1);
            }
        }
    
        int result = find(map);
        
        return result;
        */
    }
    /*
    public boolean contain(int value,Map<Integer,Integer> map){
        
        boolean found = false;
        
        for(int key : map.keySet()){
            if(key == value){
                return true;
            }
        }
        
        return false;
    }
    
    public int find(Map<Integer,Integer> map){
        
        int max = 0;
        int result = 0;
        
        for(int i : map.keySet()){
            if(map.get(i) > max){
                max = map.get(i);
                result = i;
            }
        }
        
        return result;
        
    }
    */
}