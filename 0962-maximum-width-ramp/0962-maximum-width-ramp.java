class Solution {
    public int maxWidthRamp(int[] nums) {
        
        Integer[] indices = new Integer[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            indices[i] = i;
        }
        
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));
        
        int max = 0;
        int minIndex = Integer.MAX_VALUE;
            
        for(int i = 0;i<indices.length;i++){
            minIndex = Math.min(minIndex,indices[i]);
            max = Math.max(max,indices[i] - minIndex);
        }    
        
        return max;
        
    }
}