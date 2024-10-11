class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> (b-a));
        
        long rem = 0;
        
        for(int gift : gifts){
            maxHeap.offer(gift);
            rem += gift;
        }
        
        for(int i=0;i<k;i++){
            
            int value = maxHeap.poll();
            int curRem = (int)Math.floor(Math.sqrt(value));
            rem = rem - value + curRem;
            maxHeap.offer(curRem);
            
        }
        
        return rem;
    }
}