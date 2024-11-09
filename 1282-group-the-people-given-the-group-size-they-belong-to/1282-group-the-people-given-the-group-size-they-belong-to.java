class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 0;i<groupSizes.length;i++){
            
            if(map.containsKey(groupSizes[i])){
                map.get(groupSizes[i]).add(i);
            }else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                map.put(groupSizes[i],temp);
            }
        }
        
        
        for(int key : map.keySet()){
            
            for(int i = 0;i<map.get(key).size();i = i + key){
                List<Integer> temp = new ArrayList<>();
                for(int j = i;j<i+key;j++){
                    temp.add(map.get(key).get(j));
                }
                list.add(temp);
            }
            
        }
        
        return list;
        
    }
}