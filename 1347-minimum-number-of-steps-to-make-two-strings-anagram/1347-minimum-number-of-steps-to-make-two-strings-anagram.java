class Solution {
    public int minSteps(String s, String t) {
        
        int res = 0;
        
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        
        
        for(char c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        
        for(char c : t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        
        for(char key : map1.keySet()){
            if(!map2.containsKey(key)) res += map1.get(key);
            else if(map2.get(key) < map1.get(key)) res+= map1.get(key) - map2.get(key);
         }
        
        return res;
    }
}