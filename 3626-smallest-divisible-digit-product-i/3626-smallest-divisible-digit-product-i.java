class Solution {
    public int smallestNumber(int n, int t) {

        int res = 0;
        while(true){
            int temp = n;
            int digitProduct = 1;
            while(temp > 0){
                digitProduct *= temp % 10;
                temp /= 10;
            }
            if(digitProduct % t == 0){
                res = n;
                break;
            }
            n++;
        }

        return res;
    }
}