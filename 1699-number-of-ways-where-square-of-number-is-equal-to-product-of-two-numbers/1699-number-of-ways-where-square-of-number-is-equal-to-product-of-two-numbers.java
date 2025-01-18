class Solution {
    public int numTriplets(int[] nums1, int[] nums2) {

        int res = 0;

        for(int num : nums1) {
            res += twoProduct((long)num * num, nums2);
        }
        for(int num : nums2) {
            res += twoProduct((long)num * num, nums1);
        }
        return res;
    }

    public int twoProduct(long product,int[] nums) {

        int count = 0;

        Map<Long,Long> map = new HashMap<>();

        for(long num: nums) {
            if(product % num == 0) {
                count += map.getOrDefault(product / num, 0L);
            }
            map.put(num,map.getOrDefault(num,0L) + 1);
        }

        return count;
    }
}