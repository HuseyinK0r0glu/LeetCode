class Solution {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {

        int count = 0;

        for(int i = 0; i < timeSeries.length; i++) {
            int poision = timeSeries[i];
            if(i == timeSeries.length - 1) {
                count += duration;
            }else {
                int nextPoision = timeSeries[i+1];
                if(poision + duration > nextPoision) {
                    count += nextPoision - poision;
                }else {
                    count += duration;
                }
            }
        }

        return count;

    }
}