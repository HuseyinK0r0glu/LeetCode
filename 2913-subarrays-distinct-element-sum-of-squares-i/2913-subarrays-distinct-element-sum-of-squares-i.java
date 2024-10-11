class Solution {
    public int sumCounts(List<Integer> nums) {
        
        int distinctCount = 0;
        
        for(int i = 0;i<nums.size();i++){
            Set<Integer> set = new HashSet<>();
            for(int j = i;j<nums.size();j++){
                set.add(nums.get(j));
                distinctCount += set.size() * set.size();
            }
        }
        
        return distinctCount;
        
    }
}