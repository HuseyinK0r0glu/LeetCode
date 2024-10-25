class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        backtrack(nums,0,set,new ArrayList<>());
        
        return new ArrayList<>(set);
        
    }
    
    public void backtrack(int[] nums,int index,Set<List<Integer>> set,List<Integer> temp){
        
        set.add(new ArrayList<>(temp));
        
        for(int i = index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,i+1,set,temp);
            temp.remove(temp.size()-1);
        }
        
    }
}