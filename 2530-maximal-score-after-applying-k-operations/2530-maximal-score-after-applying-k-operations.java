class Solution {
    public long maxKelements(int[] nums, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        for(int i = 0;i<nums.length;i++){
            maxHeap.offer(nums[i]);
        }
        
        long score = 0;
        
        for(int o = 0;o<k;o++){
            
            int value = maxHeap.poll();
            score += value;
            value = (int)Math.ceil((double)value/3);
            maxHeap.offer(value);
            
        }
        
        return score;
        
    }
}