class Solution {
    public boolean isPowerOfFour(int n) {

        for(int i=0;i<=31;i++) {
            double val = Math.pow(4,i);
            if(val == n) {
                return true;
            }
        }

        return false;
    }
}