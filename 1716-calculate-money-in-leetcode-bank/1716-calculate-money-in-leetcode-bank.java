class Solution {
    public static int totalMoney(int n) {
        int total = 0;

        for(int i = 0;i<n;i++){

            int week = i/7;
            int day = i%7;
            total += week + day + 1;

        }
        return total;
    }
}