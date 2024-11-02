class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 0;i<graph.length;i++){
            for(int j = 0;j<graph[i].length;j++){
                
                if(map.containsKey(i)){
                    map.get(i).add(graph[i][j]);
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(graph[i][j]);
                    map.put(i,temp);
                }
                
            }
        }
        
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        current.add(0);
        
        backtrack(map,list,0,graph.length-1,current);
        
        return list;
    }
    
    public void backtrack(Map<Integer,List<Integer>> map,List<List<Integer>> list,int start,int des,List<Integer> current){
        
        if(start == des){
           list.add(new ArrayList<>(current)); 
            return;
        }
        
        if(!map.containsKey(start)) return;
        
        List<Integer> temp = map.get(start);
        
        for(int i=0;i<temp.size();i++){
            current.add(temp.get(i));
            backtrack(map,list,temp.get(i),des,current);
            current.remove(current.size()-1);
        }
        
    }
    
}