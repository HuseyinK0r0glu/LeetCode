class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        Map<String,Integer> map = new HashMap<>();
        
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> {
           
            int comparison = Integer.compare(map.get(b),map.get(a));
            
            if(comparison == 0){
                return a.compareTo(b);
            }
            
            return comparison;
        });
        
        for(String key : map.keySet()){
            pq.add(key);
        }
        
        List<String> list = new ArrayList<>();
        
        for(int i = 0;i<k;i++){
            list.add(pq.poll());
        }
        
        return list;
    }
}