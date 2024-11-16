class Solution {
    public static int balancedStringSplit(String s) {

        int balance = 0;
        int total = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') {
                balance++;
            }else {
                balance--;
            }

            if(balance == 0) {
                total++;
            }
        }

        return total;
    }
}