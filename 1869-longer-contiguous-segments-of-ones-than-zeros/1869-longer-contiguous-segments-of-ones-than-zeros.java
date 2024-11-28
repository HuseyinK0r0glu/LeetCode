class Solution {
    public static boolean checkZeroOnes(String s) {

        int maxZero = 0;
        int maxOne = 0;
        int currentZero = 0;
        int currentOne = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '0') {
                currentZero++;
                maxOne = Math.max(maxOne, currentOne);
                maxZero = Math.max(maxZero, currentZero);
                currentOne = 0;
            }else {
                currentOne++;
                maxZero = Math.max(maxZero, currentZero);
                maxOne = Math.max(maxOne, currentOne);
                currentZero = 0;
            }
        }
        return maxOne > maxZero;
    }
}