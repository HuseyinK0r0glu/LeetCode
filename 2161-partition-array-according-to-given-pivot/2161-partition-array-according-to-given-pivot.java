class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        List<Integer> less = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        
        int count = 0;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < pivot) less.add(nums[i]);
            else if(nums[i] > pivot) bigger.add(nums[i]);
            else count++;
        }
        
        int index = 0;
        for(int i = 0;i<less.size();i++){
            nums[index++] = less.get(i);
        }
        
        for(int i = 0;i<count;i++){
            nums[index++] = pivot;
        } 
        
        for(int i = 0;i<bigger.size();i++){
            nums[index++] = bigger.get(i);
        }
        
        return nums;
    }
}