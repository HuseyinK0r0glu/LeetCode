class Solution {
    public static int minimumBoxes(int[] apple, int[] capacity) {

        int totalApple = 0;

        for(int num : apple) {
            totalApple += num;
        }

        Arrays.sort(capacity);

        int total = 0;

        for(int i = capacity.length - 1; i >= 0; i--) {
            totalApple -= capacity[i];
            total++;
            if(totalApple <= 0) break;
        }

        return total;
    }
}