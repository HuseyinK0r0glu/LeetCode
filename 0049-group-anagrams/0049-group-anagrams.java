class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s : strs){
            
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            
            if(map.containsKey(temp)){
                map.get(temp).add(s);
            }else {
                List<String> tempList = new ArrayList<>();
                tempList.add(s);
                map.put(temp,tempList);
            }
        }
        
        for(String key : map.keySet()){
            list.add(map.get(key));
        }
        
        return list;
        
    }
}