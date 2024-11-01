class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int num : nums){
            if(num > 0) pos.add(num);
            else neg.add(num);
        }
        
        int index = 0;
        
        for(int i = 0;i<pos.size();i++){
            nums[index++] = pos.get(i);
            nums[index++] = neg.get(i);
        }
        
        return nums;
    }
}