class Solution {
    public double minimumAverage(int[] nums) {
        
        double min = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int i = 0;i<nums.length/2;i++){
            min=Math.min(min,(nums[i] + nums[nums.length-i-1])/2.0);
        }
        
        return min;
    }
}