class Solution {
    public String destCity(List<List<String>> paths) {
        
        Map<String,String> map = new HashMap<>();
        
        for(List<String> list : paths){
            map.put(list.get(0),list.get(1));
        }
        
        String key = paths.get(0).get(0);
        
        while(map.containsKey(key)){
            key = map.get(key);
        }
        
        return key;
    }
}