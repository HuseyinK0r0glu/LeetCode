class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        findCom(candidates,target,set,new ArrayList<>(),0);
        
        return new ArrayList(set);
    }
    
    public void findCom(int[] candidates,int target,Set<List<Integer>> set,List<Integer> tempList,int start){
        
        if(target < 0) return;
        if(target == 0) set.add(new ArrayList<>(tempList));
        else {
            
            for(int i = start;i<candidates.length;i++){
                
                if(i > start && candidates[i] == candidates[i-1]) continue;
                
                if(candidates[i] > target) break;
                
                tempList.add(candidates[i]);
                findCom(candidates,target-candidates[i],set,tempList,i+1);
                tempList.remove(tempList.size() - 1);
            }
            
        }
    }
}