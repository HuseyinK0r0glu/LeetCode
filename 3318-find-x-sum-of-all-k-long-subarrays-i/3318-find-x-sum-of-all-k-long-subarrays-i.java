class Solution {
    public static int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
                int freqA = map.get(a);
                int freqB = map.get(b);
                if (freqA == freqB) {
                    return b - a;
                }
                return freqB - freqA;
            });

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                pq.add(entry.getKey());
            }

            int count = x;
            int sum = 0;

            while (!pq.isEmpty() && count > 0) {
                int num = pq.poll();
                sum += num * map.get(num);
                count--;
            }

            ans[i] = sum;
        }
        return ans;
    }
}