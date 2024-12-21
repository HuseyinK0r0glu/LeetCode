class Solution {
    public int maxSum(int[] nums) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int num : nums) {
            int maxDigit = 0;
            int val = num;
            while (val > 0) {
                maxDigit = Math.max(maxDigit, val % 10);
                val /= 10;
            }
            if (map.containsKey(maxDigit)) {
                map.get(maxDigit).add(num);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                map.put(maxDigit, list);
            }
        }

        int maxSum = -1;

        for(int key : map.keySet()) {
            if(map.get(key).size() > 1) {
                int first = 0;
                int second = 0;
                for(int value : map.get(key)) {
                    if (value > first) {
                        second = first;
                        first = value;
                    }else if (value > second) {
                        second = value;
                    }
                }
                maxSum = Math.max(maxSum, first + second);
            }
        }

        return maxSum;
    }

}