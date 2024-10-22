class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        
        for(int i = 0;i<nums.size()-1;i++){
            
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
            }
            
        }
        
        int l = 0;
        
        for(int r = 0;r<nums.size();r++){
            
            if(nums[r] != 0){
                
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            
        }
        
        return nums;
        
    }
};