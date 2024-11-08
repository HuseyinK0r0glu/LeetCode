class Solution {
    public int[] countBits(int n) {
        
        int[] res = new int[n+1];
        
        for(int i = 0;i<=n;i++){
            
            int j = i;
            int ones = 0;
            while(j>0){
                if((j & 1) == 1) ones++;
                j = j >> 1;
            }
            
            res[i] = ones;
        }
        
        return res;
    }
}