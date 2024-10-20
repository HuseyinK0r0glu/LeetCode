class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        findCom(candidates,target,list,new ArrayList<>(),0);
        return list;
    }
    
    public void findCom(int[] candidates,int target,List<List<Integer>> list,List<Integer> tempList,int start){
        
        if(target < 0) return;
        if(target == 0) list.add(new ArrayList(tempList));
        else {        
                for(int i = start;i<candidates.length;i++){
                tempList.add(candidates[i]);
                findCom(candidates,target-candidates[i],list,tempList,i);
                tempList.remove(tempList.size() -1 );
            }
        }

        
    }
    
}