class Solution {
    public int longestSquareStreak(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        Arrays.sort(nums);
        
        int maxLength = 0;
        
        for(int num : nums){
            int length = 0;
            while(set.contains(num)){
                length++;
                set.remove(num);
                num *= num; 
            }
            
            maxLength = Math.max(maxLength,length);
        }
        
        if(maxLength < 2) return -1;
        
        return maxLength;
    } 
}