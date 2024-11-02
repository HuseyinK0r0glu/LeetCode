class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        backtrack(list,k,n,1,new ArrayList<>(),0);
        
        return list;
    }
    
    public void backtrack(List<List<Integer>> list,int length,int sum,int index,List<Integer> current,int currentSum){
        
        if(current.size() == length && currentSum == sum){
            list.add(new ArrayList<>(current));
        }
        
        for(int i = index;i<=9;i++){
            current.add(i);
            currentSum += i;
            backtrack(list,length,sum,i+1,current,currentSum);
            current.remove(current.size()-1);
            currentSum -= i;
        }
        
    }
    
}