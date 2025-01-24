class Solution {
    
    public boolean isPowerOfThree(int n) {

        for(int i = 0;i<=31;i++){
            double val = Math.pow(3,i);
            if(val == n){
                return true;
            }
        }
        return false;
    }
}