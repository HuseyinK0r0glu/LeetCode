class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int diff = Integer.MAX_VALUE;
        int res = 0;
        
        for(int i = 0;i<nums.length-2;i++){
            
            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
                
                int val = nums[i] + nums[l] + nums[r];
                
                if(val - target == 0) return val;
                
                if(Math.abs(val-target) < diff){
                    diff = Math.abs(val-target);
                    res = val;
                }
                
                if(val < target) l++;
                if(val > target) r--;
                
            }
            
        }
        
        return res;
        
    }
}