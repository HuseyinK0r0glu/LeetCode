class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms,0,visited);
        
        for(boolean visit : visited){
            if(visit == false) return false;
        }
        
        return true;
    }
    
    public void dfs(List<List<Integer>> rooms,int room,boolean[] visited){
        
        visited[room] = true;
        
        for(int i = 0;i<rooms.get(room).size();i++){
            if(!visited[rooms.get(room).get(i)]){
                dfs(rooms,rooms.get(room).get(i),visited);
            }
        }
        
    }
    
}