class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            int comperator = Integer.compare(a[0],b[0]);
            
            if(comperator == 0){
                return Integer.compare(a[1],b[1]);
            }
            
            return comperator;
        });
        
        for(int i = 0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        
        while(k > 0){
            int[] temp = pq.poll();
            int val = temp[0] * multiplier;
            nums[temp[1]] = val;
            pq.add(new int[]{val,temp[1]});
            k--;
        }
        
        return nums;
        
    }
}