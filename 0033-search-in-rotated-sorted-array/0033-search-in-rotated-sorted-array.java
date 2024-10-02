class Solution {
    public int search(int[] nums, int target) {
    
        int pivot = 0;
        boolean rotated = false;
            
        for(int i = 0;i<nums.length-1;i++){
            
            if(nums[i] > nums[i+1]){
                pivot = i+1;
                rotated = true;
                break;
            }
        }
        
        if(rotated){
            int leftPart = binarySearch(nums,target,0,pivot-1);
            int rightPart = binarySearch(nums,target,pivot,nums.length-1);
            if(leftPart != -1){
                return leftPart;
            }
        
            if(rightPart != -1){
                return rightPart;
            }
        }
        
        int result = binarySearch(nums,target,0,nums.length-1);
        
        return result;
        
        
    }
    
    public int binarySearch(int[] helper,int target,int lo,int hi){
        
        while(lo <= hi){
            
            int mid = (lo + hi)/2;
            
            if(helper[mid] == target){
                return mid;
            }else if(helper[mid] > target){
                hi = mid - 1;
            }else {
                lo = mid + 1;
            }
            
        }
        
        return -1;
        
    }
}