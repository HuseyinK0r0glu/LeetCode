class Solution {
    public int minimumAverageDifference(int[] nums) {
        long min = Integer.MAX_VALUE;
        int index = 0;

        long[] prefixLeft = new long[nums.length];
        prefixLeft[0] = nums[0];

        for(int i = 1; i < nums.length; i++) {
            prefixLeft[i] = prefixLeft[i-1] + nums[i];
        }

        for(int i = 0;i<nums.length;i++) {
            long leftAverage = prefixLeft[i] / (i+1);
            if(i == nums.length - 1) {
                if(leftAverage < min) {
                    min = leftAverage;
                    index = i;
                }
            }else {
                long rightAverage = (prefixLeft[prefixLeft.length - 1] - prefixLeft[i]) / (nums.length-i-1);
                if(Math.abs(leftAverage-rightAverage) < min){
                    min = Math.abs(leftAverage-rightAverage);
                    index = i;
                }
            }
        }

        return index;
    }
}