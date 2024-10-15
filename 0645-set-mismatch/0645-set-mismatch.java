class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        int[] result = new int[2];
        
        for(int num : nums){
            if(set.contains(num)) result[0] = num;
            set.add(num);
        }
        
        for(int i = 1;i<=nums.length;i++){
            if(!set.contains(i)) result[1] = i;
        }
        
        return result;
        
    }
}