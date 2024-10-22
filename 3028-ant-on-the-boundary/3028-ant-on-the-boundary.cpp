class Solution {
public:
    int returnToBoundaryCount(vector<int>& nums) {
        
        vector<int> prefix(nums.size(),0);
        
        int sum = 0;
        
        for(int i = 0;i<nums.size();i++){
            sum += nums[i];
            prefix[i] = sum;
        }
        
        int zeroCount = 0;
        for(int i = 0;i<prefix.size();i++){
            if(prefix[i] == 0) zeroCount++;
        }
        
        return zeroCount;
    }
};