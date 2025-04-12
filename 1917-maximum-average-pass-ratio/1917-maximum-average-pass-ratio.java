class Solution {
    public double maxAverageRatio(int[][] classes,int extraStudents) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            double ratio1 = (double) (classes[b][0] + 1) / (classes[b][1] + 1) - (double) (classes[b][0]) / (classes[b][1]);
            double ratio2 = (double) (classes[a][0] + 1) / (classes[a][1] + 1) - (double) (classes[a][0]) / (classes[a][1]);
            return Double.compare(ratio1, ratio2);
        });

        for(int i = 0;i<classes.length;i++) {
            pq.add(i);
        }

        while(extraStudents>0) {
            int leastIndex = pq.poll();
            classes[leastIndex][0]++;
            classes[leastIndex][1]++;
            pq.add(leastIndex);
            extraStudents--;
        }

        double res = 0;
        for(int[] c : classes) {
            System.out.println(c[0] + " " + c[1]);
            res += (double) c[0] / (double) c[1];
        }

        return res / classes.length;
    }
}