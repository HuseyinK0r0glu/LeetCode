class Solution {
     public long coloredCells(int n) {

        long count = 1;
        for(int i = 2;i<=n;i++){
            count += (i-1) * 4;
        }

        return count;
    }
}