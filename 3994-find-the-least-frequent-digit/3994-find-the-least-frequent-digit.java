import java.util.HashMap;
import java.util.Map;

class Solution {
    public int getLeastFrequentDigit(int n) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        while(n > 0){
            int value = n % 10;
            map.put(value, map.getOrDefault(value, 0) + 1);
            n = n / 10;
        }
        
        int leastFrequent = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        
        for(int key : map.keySet()){
            if(leastFrequent > map.get(key)){
                leastFrequent = map.get(key);
                result = key;
            }else  if(leastFrequent == map.get(key)){
                result = Math.min(key, result);
            }
        }
        
        return result;
    }
}