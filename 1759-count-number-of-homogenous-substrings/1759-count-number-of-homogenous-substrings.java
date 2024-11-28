class Solution {
    public static int countHomogenous(String s) {

        int modulo = 1_000_000_007;
        long total = 0;
        char current = '\0';
        int count = 0;

        for(int i = 0;i<s.length();i++) {

            if(s.charAt(i) == current) {
                count++;
            }else {
                total = (total + ((long) count * (count + 1) / 2)) % modulo;
                count = 1;
                current = s.charAt(i);
            }
        }

        total = (total + ((long) count * (count + 1) / 2)) % modulo;

        return (int) total;
    }
}