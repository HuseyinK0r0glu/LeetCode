class Solution {
    public String triangleType(int[] nums) {
        
        if(nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0]){
            Arrays.sort(nums);
            int equal = 0;
            for(int i = 0;i<nums.length-1;i++){
                if(nums[i] == nums[i+1]){
                    equal++;
                }
            }
            
            if(equal == 0){
                return "scalene";
            }else if(equal == 2){
                return "equilateral";
            }else {
                return "isosceles";
            }
        }
        
        return "none";
    }
}