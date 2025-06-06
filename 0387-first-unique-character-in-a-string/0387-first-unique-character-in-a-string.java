class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character,Integer> map = new HashMap<>();
    
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),-1);
            }
            
            else map.put(s.charAt(i) , i);
        }
        
        int index = Integer.MAX_VALUE;
        
        for(char c : map.keySet()){
            if(map.get(c) > -1){
                if(map.get(c) < index){
                    index = map.get(c);
                }
            }
        }
        
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}