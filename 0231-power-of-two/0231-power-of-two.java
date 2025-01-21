class Solution {
    public boolean isPowerOfTwo(int n) {

        for(int i=0;i<=31;i++) {
            long asnwer = (long)Math.pow(2, i);
            if(asnwer == n) {
                return true;
            }
        }

        return false;
    }
}