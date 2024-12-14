class Solution {
    public int bitwiseComplement(int n) {

        if(n == 0) return 1;

        int msb = (int)(Math.log(n) / Math.log(2)) + 1;
        return ((1 << msb) - 1) ^ n;

    }
}