class Solution {
    public boolean isBipartite(int[][] graph) {

        Map<Integer,Set<Integer>> map = new HashMap<>();

        for(int i = 0; i < graph.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j = 0; j < graph[i].length; j++){
                set.add(graph[i][j]);
            }
            map.put(i,set);
        }

        boolean[] color = new boolean[graph.length];
        Set<Integer> visited = new HashSet<>();

        for(int i = 0; i < graph.length; i++){
            if(!visited.contains(i)){
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                while(!stack.isEmpty()){
                    int u = stack.pop();
                    visited.add(u);
                    Set<Integer> set = map.get(u);
                    for(int v : set){
                        if(!visited.contains(v)){
                            visited.add(v);
                            stack.push(v);
                            color[v] = !color[u];
                        }else if(color[v] == color[u]){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}