class Solution {
    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {

        int[] res = new int[2];

        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])>=valueDifference && Math.abs(i-j) >= indexDifference){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        res[0] = -1;
        res[1] = -1;
        return res;
    }
}