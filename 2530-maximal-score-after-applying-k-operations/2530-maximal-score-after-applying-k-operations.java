class Solution {
    public long maxKelements(int[] nums, int k) {
        
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b-a);
        
        for(int num : nums){
            heap.offer(num);
        }
        
        long score = 0;
        
        for(int o = 0;o<k;o++){
            
            int value = heap.poll();
            score += value;
            value = (int)Math.ceil((double)value/3);
            heap.offer(value);
            
        }
        
        return score;
        
    }
}