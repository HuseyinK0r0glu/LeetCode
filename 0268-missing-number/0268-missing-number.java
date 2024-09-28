class Solution {
    public int missingNumber(int[] nums) {
        
        int total = 0;
        int numbers = 0;
        
        for(int i = 0;i<=nums.length;i++){
            total += i;
        }
        
        for(int i = 0;i<nums.length;i++){
            numbers += nums[i];
        }
        
        return total - numbers;
        /*
        Arrays.sort(nums);
        
        
        for(int i = 0;i<nums.length;i++){
            
            if(i != nums[i]){
                return i;
            }
            
        }
        
        return 0;
        */

        
    }
}