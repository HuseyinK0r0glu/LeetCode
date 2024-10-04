class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        // two pointers 
        
        int left = 0;
        int right = n;
        int current = 0;
        
        int[] result = new int[nums.length];
        
        while(left < n){
            result[current++] = nums[left++];
            result[current++] = nums[right++];
        }
        
        return result;
    }
}