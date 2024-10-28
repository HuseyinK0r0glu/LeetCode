class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        pascal(rowIndex+1,list);
        
        return list.get(rowIndex);
        
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