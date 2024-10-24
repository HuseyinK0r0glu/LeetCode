class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        Arrays.sort(nums);
        
        backtrack(nums,set,new ArrayList<>(),0);
        
        return new ArrayList<>(set);
    }
    
    public void backtrack(int[] nums,Set<List<Integer>> set,ArrayList<Integer> list,int index){
        
        set.add(new ArrayList<>(list));
        
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(nums,set,list,i+1);
            list.remove(list.size()-1);
        }
        
    }
    
}