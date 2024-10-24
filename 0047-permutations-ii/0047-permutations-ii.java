class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        findPermut(nums,set,0,nums.length-1);
     
        return new ArrayList<>(set);
    }
    
    public void findPermut(int[] nums,Set<List<Integer>> set,int left,int right){
        
        if(left == right){
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<nums.length;i++){
                list.add(nums[i]);
            }
            set.add(list);
        }
        
        for(int i = left;i<=right;i++){
            
            swap(nums,left,i);
            findPermut(nums,set,left+1,right);
            swap(nums,left,i);
            
        } 
    }
    
    public void swap(int[] array,int i,int j){
        
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}