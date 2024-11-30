class Solution {
    public long[] sumOfThree(long num) {

        long[] result = new long[0];
        
        if(num % 3 == 0){
            result = new long[3];
            long val = num / 3;
            result[0] = val - 1;
            result[1] = val;
            result[2] = val + 1;
        }
        return result;
    }
}