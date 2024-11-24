class Solution {
    public static int reverse(int x) {

        boolean isNegative = false;

        if(x < 0) {
            x = x * -1;
            isNegative = true;
        }

        int res = 0;

        StringBuilder sb = new StringBuilder();

        sb.append(x);

        try{
            res = Integer.parseInt(sb.reverse().toString());
        }catch (Exception e) {
            return 0;
        }

        return isNegative ? -res : res;
    }
}