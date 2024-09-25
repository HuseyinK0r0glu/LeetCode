class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int N = nums.length;
        int lo = 0;
        int hi = N - 1;
        
        int mid = 0; 
        
        while(lo <= hi){
            
            mid = (lo+hi)/2;
            
            if(target == nums[mid]){
                return mid;
            }if (nums[mid] > target){
                hi = mid - 1;
            }else {
                lo = mid + 1;
            }
            
        }
        
        if(lo == hi){
            if(nums[lo] < target ){
                return lo-1;
            }else {
                return hi+1;
            }
        }
        return lo;
    }
    
}