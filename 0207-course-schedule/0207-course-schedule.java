class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // if a cycle is found it courses can't be completed
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        for(int i = 0;i<prerequisites.length;i++){
            int course = prerequisites[i][0];
            int mustCourse = prerequisites[i][1];
            if(map.containsKey(course)){
                map.get(course).add(mustCourse);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(mustCourse);
                map.put(course,list);
            }
        }
        
        Set<Integer> visited = new HashSet<>();
        
        for(int i = 0;i<numCourses;i++){
            if(dfs(map,visited,i) == false) return false;
        }
        
        return true;
        
    }
    
    public boolean dfs(Map<Integer,List<Integer>> map,Set<Integer> visited,int course){
        
        if(visited.contains(course)) return false;
        
        if (!map.containsKey(course) || map.get(course).isEmpty()) return true;
        
        List<Integer> mustCourses = map.get(course);
        
        visited.add(course);
        
        for(int mustCourse : mustCourses){
            if(!dfs(map,visited,mustCourse)){
                return false;
            }
        }
        visited.remove(course);
        map.put(course,new ArrayList<>());
        return true;
        
    }
}