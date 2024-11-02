class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            
            int diffA = Math.abs(a-x);
            int diffB = Math.abs(b-x);
            
            if(diffA == diffB){
                return Integer.compare(a,b);
            }
            
            return Integer.compare(diffA,diffB);
            
        });
        
        
        for(int num : arr){
            pq.add(num);
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0;i<k;i++){
            list.add(pq.poll());
        }
        
        Collections.sort(list);
        
        return list;
    }
}