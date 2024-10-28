class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        pascal(numRows,list);
            
        return list;
        
    }
    
    public List<Integer> pascal(int n,List<List<Integer>> list){
        
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        
        if(n == 1){
            list.add(temp);
            return temp;
        }
        
        List<Integer> prev = pascal(n-1,list);
        
        for(int i = 0;i<prev.size()-1;i++){
            temp.add(prev.get(i) + prev.get(i+1));
        }
        
        temp.add(1);
        
        list.add(temp);
        return temp;
        
    }
    
}