class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        // common string and sum
        Map<String,Integer> map = new HashMap<>();
        
        // find the least index sum
        int leastSum = list1.length + list2.length;
        
        for(int i = 0;i<list1.length;i++){
            for(int j =0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    map.put(list1[i],i+j);
                    if(i + j < leastSum){
                        leastSum = i + j;
                    }
                    break;
                }
            }
        }
        
        List<String> list = new ArrayList<>();
        
        for(String s : map.keySet()){
            if(map.get(s) == leastSum){
                list.add(s);
            }
        }
        

        
        String[] array = list.toArray(new String[0]);
        
        return array;
        
    }
}