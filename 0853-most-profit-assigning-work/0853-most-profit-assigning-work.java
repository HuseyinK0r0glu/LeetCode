import java.util.*;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int total = 0;
        Arrays.sort(worker);

        for(int i = 0;i<worker.length;i++){
            int max = 0;
            for(int j = 0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i]){
                    max = Math.max(max,profit[j]);
                }
            }
            total += max;
        }

        return total;
    }
}