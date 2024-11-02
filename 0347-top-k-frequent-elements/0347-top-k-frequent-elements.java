class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }    
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((num1,num2) -> Integer.compare(map.get(num2),map.get(num1)));
        
        for(int key : map.keySet()){
            pq.add(key);
        }
        
        int[] res = new int[k];
        
        for(int i = 0;i<res.length;i++){
            res[i] = pq.peek();
            pq.poll();
        }
        
        return res;
        
    }
}