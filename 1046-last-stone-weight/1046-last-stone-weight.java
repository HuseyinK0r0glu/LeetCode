class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int stone : stones){
            pq.add(stone);
        }
        
        while(pq.size() >= 2){
            int first = pq.poll();
            int second = pq.poll();
            if(first != second){
                pq.add(Math.abs(first - second));
            }
        }
        
        if(pq.size() == 1) return pq.peek();
        
        return 0;
    }
}