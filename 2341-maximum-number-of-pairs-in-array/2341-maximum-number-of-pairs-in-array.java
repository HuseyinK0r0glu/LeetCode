class Solution {
    public static int[] numberOfPairs(int[] nums) {

        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for(int key : map.keySet()) {
            res[0] += map.get(key) / 2;
            res[1] += map.get(key) % 2;
        }

        return res;

    }
}