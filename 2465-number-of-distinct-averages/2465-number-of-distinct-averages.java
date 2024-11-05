class Solution {
    public int distinctAverages(int[] nums) {
        
        Set<Double> set = new HashSet<>();
        
        Arrays.sort(nums);
        
        for(int i = 0;i<nums.length/2;i++){
            set.add((nums[i] + nums[nums.length-i-1])/2.0);
        }
        
        return set.size();
    }
}