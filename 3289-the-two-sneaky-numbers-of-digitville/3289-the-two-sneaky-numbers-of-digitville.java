class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        int[] result = new int[2];
        
        Arrays.sort(nums);
        
        int current = 0;
        
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                result[current++] = nums[i];
                i++;
                if(current == 2){
                    return result;
                }
            }
        }
        
        return result;
        
    }
}