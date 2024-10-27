    class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {

            if(source == destination) return true;

            Map<Integer,List<Integer>> map = new HashMap<>();

            // adjacency list with hashmap
            for(int i = 0;i<edges.length;i++){
                int start = edges[i][0];
                int end = edges[i][1];
                if(map.containsKey(start)){
                    map.get(start).add(end);
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(end);
                    map.put(start,list);
                }
                if(map.containsKey(end)){
                    map.get(end).add(start);
                }else{
                    List<Integer> list = new ArrayList<>();
                    list.add(start);
                    map.put(end,list);
                }
                
            }

            if(!map.containsKey(source)){
                return false;
            }

            Set<Integer> visited = new HashSet<>();
            Queue<Integer> q = new LinkedList<>();  
            q.offer(source);
            visited.add(source);

            while(!q.isEmpty()){

                int s = q.poll();

                if(map.containsKey(s)){
                    List<Integer> list = map.get(s);

                    for(int num : list){
                        if(num == destination) return true;
                        if(!visited.contains(num)){
                            q.offer(num);
                            visited.add(num);
                        }
                    }   
                }
            }

            if(visited.contains(destination)) return true;
            return false;

        }
    }