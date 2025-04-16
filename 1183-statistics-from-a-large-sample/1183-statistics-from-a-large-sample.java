import java.util.*;

class Solution {
    public double[] sampleStats(int[] count) {

        double[] res = new double[5];

        double max = 0;
        double min = Double.MAX_VALUE;
        int maxMode = 0;
        int mode = 0;
        long totalSum = 0;
        int totalCount = 0;

        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                max = Math.max(max,i);
                min = Math.min(min,i);
                totalSum += (long) i * count[i];
                totalCount += count[i];
                if(count[i] > maxMode){
                    maxMode = count[i];
                    mode = i;
                }
            }
        }

        double median = getMedian(count,totalCount);

        if(min == Double.MAX_VALUE) min = 0;

        res[0] = min;
        res[1] = max;
        res[2] = (double) totalSum / totalCount;
        res[3] = median;
        res[4] = mode;

        // res => [minimum, maximum, mean, median, mode]
        return res;
    }

    public double getMedian(int[] count, int totalCount) {
        int index = 0;
        double median = 0;
        double m1 = -1;
        double m2 = -1;
        if(totalCount % 2 == 0){
            for(int i = 0;i<count.length;i++){
                if(count[i] == 0){
                    continue;
                }

                if(index + count[i] >= totalCount / 2 && m1 == -1){
                    m1 = i;
                }

                if(index + count[i] >= totalCount / 2 + 1){
                    m2 = i;
                    break;
                }

                index += count[i];

            }
            return (m1 + m2) / 2.0;
        }else {
            for(int i = 0;i<count.length;i++){
                if(count[i] == 0){
                    continue;
                }

                if(index + count[i] <= totalCount/2){
                    index += count[i];
                }else {
                    return i;
                }
            }
        }
        return median;
    }
}