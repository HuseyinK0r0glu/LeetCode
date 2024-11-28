class Solution {
    public static int numSub(String s) {

        int modulo = 1_000_000_007;

        long total = 0;
        int current = 0;

        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i) == '1'){
                current++;
            }else {
                total = (total + ((long) current * (current + 1) / 2)) % modulo;
                current = 0;
            }
        }
        total = (total + ((long) current * (current + 1) / 2)) % modulo;
        return (int)(total % modulo);
    }
}