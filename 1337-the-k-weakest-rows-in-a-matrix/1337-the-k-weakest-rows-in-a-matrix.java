class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int[] res = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < mat.length; i++) {
            int ones = 0;
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == 1) ones++;
            }
            map.put(i, ones);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if(Objects.equals(map.get(a), map.get(b))) {
                return a - b;
            }
            return map.get(a) - map.get(b);
        });

        pq.addAll(map.keySet());

        int index = 0;

        while(!pq.isEmpty() && index < k) {
            res[index++] = pq.poll();
        }
        return res;
    }
}