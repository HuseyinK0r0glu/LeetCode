class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        
        int[] remainderCount = new int[k];
        
        for(int i : arr){
            remainderCount[((i%k) + k) % k]++;
        }
        
        if(remainderCount[0] % 2 != 0){
            return false;
        }
        
        for(int i = 1;i<=k/2;i++){
            if(remainderCount[i] != remainderCount[k-i]){
                return false;
            }
        }
        
        return true;
        
    }
}