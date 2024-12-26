class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(int i = 0; i < matrix.length; i++) {
            pq.add(new int[]{matrix[i][0],i,0});
        }

        int count = 0;
        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int val = current[0];
            int row = current[1];
            int col = current[2];
            count++;

            if(count == k) {
                return val;
            }

            if(col + 1 < matrix[row].length) {
                pq.add(new int[]{matrix[row][col+1],row,col+1});
            }
        }

        return -1;
    }
}