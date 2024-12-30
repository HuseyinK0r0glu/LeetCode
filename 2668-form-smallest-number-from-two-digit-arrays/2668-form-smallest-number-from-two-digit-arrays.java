class Solution {
    public int minNumber(int[] nums1, int[] nums2) {

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int common = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();

        for (int j : nums1) {
            set.add(j);
            firstMin = Math.min(firstMin, j);
        }

        for (int j : nums2) {
            if (set.contains(j)) {
                common = Math.min(common, j);
            }
            secondMin = Math.min(secondMin, j);
        }

        if(common != Integer.MAX_VALUE) {
            return common;
        }
        
        if(firstMin < secondMin){
            return firstMin * 10 + secondMin;
        }

        return secondMin * 10 + firstMin;
    }
}