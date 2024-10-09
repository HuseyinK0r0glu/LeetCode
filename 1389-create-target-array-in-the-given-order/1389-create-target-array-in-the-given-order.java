class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> target = new ArrayList<>();
        
        for(int i = 0;i<index.length;i++){
            target.add(index[i],nums[i]);
        }
        
        int[] array = new int[nums.length];
        
        for(int i = 0;i<target.size();i++){
            array[i] = target.get(i);
        }
        
        return array;
    }
}