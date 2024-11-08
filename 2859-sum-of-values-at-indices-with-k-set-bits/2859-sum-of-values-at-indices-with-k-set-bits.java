class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int total = 0;
        
        for(int i = 0;i<nums.size();i++){
            
            int ones = 0;
            int j = i;
            while(j > 0){
                if((j & 1) == 1) ones++;
                j = j >> 1;
            }
            
            if(ones == k) total += nums.get(i);
        }
        
        return total;
        
    }
}