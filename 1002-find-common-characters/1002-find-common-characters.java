class Solution {
    public List<String> commonChars(String[] words) {
        
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        
        for(char c : words[0].toCharArray()){
            map.put(String.valueOf(c), map.getOrDefault(String.valueOf(c), 0) + 1);
        }
        
        for(int i = 0;i<words.length;i++){
            Map<String,Integer> temp = new HashMap<>();
            String s = words[i];
            
            for(int j = 0;j<s.length();j++){
                temp.put(String.valueOf(s.charAt(j)),temp.getOrDefault(String.valueOf(s.charAt(j)),0) + 1);
            }
            
            
            for(String key : map.keySet()){
                if(temp.containsKey(key)){
                    map.put(key,Math.min(map.get(key),temp.get(key)));
                }else {
                    map.put(key,0);
                }
            }
            
        }
        
        for(String key : map.keySet()){
            int val = map.get(key);
            for(int i = 0;i<val;i++){
                list.add(key);
            }
        }
        
        return list;
        
    }
}