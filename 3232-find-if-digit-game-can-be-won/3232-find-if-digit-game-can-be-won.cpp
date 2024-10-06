class Solution {
public:
    bool canAliceWin(vector<int>& nums) {
        
        int singleD = 0;
        int doubleD = 0;
        
        for(int num : nums){
            if(num >= 10){
                doubleD+=num;
            }else {
                singleD+=num;
            }
        }
        
        return !(singleD== doubleD);
        
    }
};