class Solution {
    public static int[] rowAndMaximumOnes(int[][] mat) {

        int[] res = new int[2];

        for(int i = 0;i<mat.length;i++) {
            int ones = 0;
            for(int j = 0;j<mat[i].length;j++) {
                if(mat[i][j] == 1) {
                    ones++;
                }
            }

            if(ones > res[1]){
                res[1] = ones;
                res[0] = i;
            }
        }

        return res;
    }
}