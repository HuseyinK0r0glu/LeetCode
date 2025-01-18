class Solution {
    public int divisorSubstrings(int num, int k) {

        String stringNum = String.valueOf(num);
        int res = 0;

        for(int i = 0; i <= stringNum.length()-k; i++) {
            String subString = stringNum.substring(i, i+k);
            int subNum = Integer.parseInt(subString);
            if(subNum != 0 && num % subNum == 0) {
                res++;
            }
        }
        return res;
    }
}