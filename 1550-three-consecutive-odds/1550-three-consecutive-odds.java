class Solution {
    public static boolean threeConsecutiveOdds(int[] arr) {

        if(arr.length < 3) return false;

        int threeOdd = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] % 2 == 1) {
                threeOdd++;
                if(threeOdd == 3) return true;
            }
            else {
                threeOdd = 0;
            }
        }
        return false;
    }
}