class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int[] prefix = new int[nums.size() + 1];
        prefix[0] = 0;

        for(int i = 0; i < nums.size(); i++){
            prefix[i+1] = prefix[i] + nums.get(i);
        }

        int min = Integer.MAX_VALUE;

        for(int len = l; len <= r; len++){
            for(int i = 0;i + len < prefix.length;i++){
                int sum = prefix[i + len] - prefix[i];
                if(sum > 0){
                    min = Math.min(min, sum);
                }
            }
        }

        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}