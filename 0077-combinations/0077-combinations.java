class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(n,k,1,new ArrayList<>(),result);
        
        return result;
        
    }
    
    public void backtrack(int n,int k,int index,List<Integer> list,List<List<Integer>> result){
        
        if(list.size() == k){
            result.add(new ArrayList<>(list));
        }
        
        for(int i = index;i<=n;i++){
            list.add(i);
            backtrack(n,k,i+1,list,result);
            list.remove(list.size()-1);
        }
        
    }
    
}