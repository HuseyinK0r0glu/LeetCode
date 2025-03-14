class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int rowCount = 0;
        for(int [] row : grid) {
            Arrays.sort(row);
            int i = 0;
            while(i < limits[rowCount]) {
                pq.add(row[row.length - i - 1]);
                i++;
            }
            rowCount++;
        }

        long sum = 0;

        while(!pq.isEmpty() && k > 0) {
            sum += pq.poll();
            k--;
        }

        return sum;
    }
}