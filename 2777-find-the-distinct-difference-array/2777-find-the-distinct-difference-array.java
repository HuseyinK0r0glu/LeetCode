class Solution {
        public int[] distinctDifferenceArray(int[] nums) {

            int[] prefix = new int[nums.length];
            int[] suffix = new int[nums.length];
            
            Set<Integer> set = new HashSet<>();
            
            for(int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
                prefix[i] = set.size();
            }
            
            set.clear();
            
            for(int i = nums.length - 1; i >= 0; i--) {
                suffix[i] = set.size();
                set.add(nums[i]);
            }
            
            int[] result = new int[nums.length];
            
            for(int i = 0; i < nums.length; i++) {
                result[i] = prefix[i] - suffix[i];
            }
            
            return result;
        }
}