class Solution {
    public int minOperations(int[] nums, int k) {
     
        int xor = 0;
        
        for(int num : nums){
            xor = xor ^ num;
        }
        
        if(xor == k) return 0;
        
        int count = 0;
        
        while(xor > 0 || k > 0){
            
            int xorBit = xor & 1;
            int kBit = k & 1;
            
            if(xorBit != kBit) count++;
            
            xor = xor >> 1;
            k = k >> 1;
        }
        
        return count;
    }
}