class Solution {
    public int findCenter(int[][] edges) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<edges.length;i++){
            for(int j = 0;j<edges[0].length;j++){
                if(map.containsKey(edges[i][j])){
                    map.put(edges[i][j],map.get(edges[i][j]) + 1);
                }else {
                    map.put(edges[i][j],1);
                }
            }
        }
        
        for(int key : map.keySet()){
            if(map.get(key) == edges.length) return key;
        }
        
        return 0;
        
    }
}