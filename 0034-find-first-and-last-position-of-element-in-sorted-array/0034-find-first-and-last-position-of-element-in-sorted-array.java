class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        // starting and ending positions of the target
        // if not found [-1,-1]
        
        int[] result = new int[2];
        
        if(nums.length == 0){
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        
        int left = 0;
        int right = nums.length-1;
        
        while(left<=right){
            int mid = (left + right)/2;
            
            if(nums[mid] == target){
                int leftMost = 0;
                int rightMost = 0;
                int k = 1;
                while(mid-k >= 0 && nums[mid-k] == target){
                    leftMost++;
                    k++;
                }
                k = 1;
                while(mid + k <= nums.length-1 && nums[mid+k] == target){
                    rightMost++;
                    k++;
                }
                
                result[0] = mid - leftMost;
                result[1] = mid + rightMost;
                return result;
                    
            }else if(nums[mid] > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        
        result[0] = -1;
        result[1] = -1;
        return result;

    }
}