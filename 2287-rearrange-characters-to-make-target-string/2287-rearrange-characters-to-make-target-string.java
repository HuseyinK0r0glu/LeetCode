class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        Map<Character,Integer> targetMap = new HashMap<>();
        
        for(char c : target.toCharArray()){
            targetMap.put(c,targetMap.getOrDefault(c,0)+1);
        }
        
        int min = Integer.MAX_VALUE;
        
        for(char key : targetMap.keySet()){
            if(!map.containsKey(key)){
                return 0;
            }
            
            min = Math.min(min,(map.get(key)/targetMap.get(key)));
            
        }
        
        return min;
    }
}