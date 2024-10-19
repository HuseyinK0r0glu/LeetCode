class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> list = new ArrayList<>();
        
        Map<String,Integer> map = new HashMap<>();
        
        int left = 0;
        for(int right = 10;right<=s.length();right++){
            map.put(s.substring(left,right),1+map.getOrDefault(s.substring(left,right),0));
            left++;
        }
        
        
        for(String key : map.keySet()){
            if(map.get(key) > 1){
                list.add(key);
            }
        }
        
        return list;
    }
}