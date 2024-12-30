class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {

        Set<Integer> set = new HashSet<>();

        for(int[] range : ranges) {
            int start = range[0], end = range[1];
            for(int i = start; i <= end; i++) {
                set.add(i);
            }
        }
        
        for(int i = left; i <= right; i++) {
            if(!set.contains(i)) {
                return false;
            }
        }

        return true;
    }
}