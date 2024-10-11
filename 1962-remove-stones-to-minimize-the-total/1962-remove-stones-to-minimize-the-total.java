class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        int remaining = 0;
        for(int pile : piles){
            remaining += pile;   
            maxHeap.offer(pile);
        }
        
        // do k operations
        for(int o = 0;o<k;o++){
            
            int value = maxHeap.poll();
            int removed = (int)Math.floor((double)value/2);
            remaining -= removed;
            maxHeap.offer(value-removed);
        }
        
        return remaining;
    }
}