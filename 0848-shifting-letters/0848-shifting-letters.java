class Solution {
    public static String shiftingLetters(String s, int[] shifts) {

        int[] prefix = new int[shifts.length];
        int sum = 0;

        for(int i = shifts.length-1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;
            prefix[i] = sum;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            int original = s.charAt(i) - 'a';
            int shifted = (original + prefix[i]) % 26;
            sb.append((char) (shifted + 'a'));
        }
        return sb.toString();
    }
}