class Solution {
    public int findGCD(int[] nums) {
        
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[nums.length-1];
        
        int common = 1;
        
        for(int i = 2;i<=min;i++){
            if(min % i == 0 && max % i == 0 && i > common){
                common = i;
            }
        }
        
        
        return common;
    }
}