class Solution {
    public int mostFrequentEven(int[] nums) {
        
        // key number value frequency
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i : nums){
            
            if(i%2 == 0){
                if(map.get(i) == null){
                    map.put(i,1);
                }else {
                    int value = map.get(i);
                    map.put(i,value + 1);
                }
            }
            
        }
        
        int maxFrequency = 0;
        int number = -1;
        
        for(int key : map.keySet()){
            
            if(map.get(key) > maxFrequency ){
                maxFrequency = map.get(key);
                number = key;
            }else if(map.get(key) ==  maxFrequency){
                if(number == -1 || key < number){
                    number = key;
                }
            }
            
        }
        
        return number;
        
    }
}