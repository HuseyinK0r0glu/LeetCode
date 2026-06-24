class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            map.put(j,map.getOrDefault(j,0)+1);
        }

        int res = 0;

        for(int num : map.keySet()) {
            if(map.containsKey(num+1)){
                res = Math.max(res,map.get(num+1) + map.get(num));
            }
            if (map.containsKey(num-1)){
                res = Math.max(res,map.get(num-1) + map.get(num));
            }
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna