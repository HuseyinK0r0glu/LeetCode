class Solution {
    public int findMaxK(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        int max = 0;

        for(int num : set){
            if(set.contains(num * -1)){
                max = Math.max(max, num);
            }
        }

        if(max == 0) return -1;
        return max;

    }
}