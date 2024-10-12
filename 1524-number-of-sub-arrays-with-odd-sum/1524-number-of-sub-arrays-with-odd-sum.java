class Solution {
    public int numOfSubarrays(int[] arr) {
        
        long[] prefix = new long[arr.length+1];
        prefix[0] = 0;
        long sum = 0;
        
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            prefix[i+1] = (long)sum;
        }
        
       
        int m = 1000000007;
        
        long oddCount = 0;
        long evenCount = 0;
        int total = 0;
        
        for(int i = 0;i<prefix.length;i++){
            if(prefix[i] % 2 == 0){
                evenCount++;
                total += oddCount;
                total = total % m;
            }else {
                oddCount++;
                total += evenCount;
                total = total % m;
            }    
        }
        
        return (total)%m;
        
    }
}