class Solution {
    public boolean isThree(int n) {
        
        int result = 0;
        
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                result++;
            }
        }
        
        return result == 3 ? true : false;
        
    }
}