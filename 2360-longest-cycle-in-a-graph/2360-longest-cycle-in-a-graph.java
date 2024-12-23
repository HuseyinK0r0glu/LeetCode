class Solution {
public int longestCycle(int[] edges) {

        int longest = -1;
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < edges.length; i++) {
            if(!map.containsKey(i)) {
                longest = Math.max(longest,dfs(i,edges,map,0,set));
            }
        }

        return longest;
    }

    private int dfs(int node,int[] edges,Map<Integer, Integer> map, int distance,Set<Integer> set) {

        if (node == -1) return -1;

        if(set.contains(node)) {
            return distance - map.get(node);
        }

        if(map.containsKey(node)) {
            return -1;
        }

        map.put(node,distance);
        set.add(node);

        int cycle = dfs(edges[node],edges,map,distance+1,set);
        set.remove(node);
        return cycle;
    }
}