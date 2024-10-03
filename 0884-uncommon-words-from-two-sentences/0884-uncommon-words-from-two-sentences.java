class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String,Integer> map = new HashMap<>();
        
        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");
        
        for(int i = 0;i<s1Array.length;i++){
            if(map.containsKey(s1Array[i])){
                map.put(s1Array[i],map.get(s1Array[i]) + 1);
            }else {
                map.put(s1Array[i],1);
            }
        }
        
        for(int i = 0;i<s2Array.length;i++){
            if(map.containsKey(s2Array[i])){
                map.put(s2Array[i],map.get(s2Array[i]) + 1);
            }else{
                map.put(s2Array[i],1);
            }
        }
        
        List<String> list = new ArrayList<>();
        
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                list.add(s);
            }
        }
        
        return list.toArray(new String[0]);
        
    }
}