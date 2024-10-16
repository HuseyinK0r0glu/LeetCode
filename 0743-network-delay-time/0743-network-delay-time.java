class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        // adjacency list
        Map<Integer,List<int[]>> graph = new HashMap<>();
        
        // initialize adjacency list
        for(int[] time : times){
            int startP = time[0];
            int endP = time[1];
            int weight = time[2];
            
            if(graph.containsKey(startP)){
                int[] way = {endP,weight};
                graph.get(startP).add(way);
            }else {
                List<int[]> list = new ArrayList<>();
                int[] way = {endP,weight};
                list.add(way);
                graph.put(startP,list);
            }
            
        }
        
        // to keep track of the visited edges 
        Set<Integer> visited = new HashSet<>();
        
        // first element of the array will be the weight to achieve it and second one will be the edge
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0,k});
        int t = 0;
        
        while(!pq.isEmpty()){
            
            int[] current = pq.poll();
            int weight = current[0];
            int edge = current[1];
            
            if(visited.contains(edge)) continue;
            
            visited.add(edge);
            t = Math.max(t,weight);
            
            if(graph.containsKey(edge)){
                
                List<int[]> list = graph.get(edge);
                
                for(int[] cur : list){
                    int endP = cur[0];
                    int w = cur[1];
                    if(!visited.contains(endP)){
                        pq.offer(new int[]{w + weight,endP});
                    }
                }
                
            }
            
        }
        
        if(visited.size() == n) return t;
        return -1;
        
    }
}