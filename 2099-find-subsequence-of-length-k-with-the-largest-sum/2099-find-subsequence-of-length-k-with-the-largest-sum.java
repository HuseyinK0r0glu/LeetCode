class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            return b[0] - a[0];
        });

        for(int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            list.add(pq.poll());
        }

        list.sort(Comparator.comparingInt(a -> a[1]));

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = list.get(i)[0];
        }
        return res;
    }
}