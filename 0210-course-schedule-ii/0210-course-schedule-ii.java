class Solution {
    public int index;
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // we keep adj list in map 
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
        Set<Integer> cycle = new HashSet<>();
        
        int[] top = new int[numCourses];
        
        index = 0;
        
        for(int i = 0;i<numCourses;i++){
            if(dfs(map,visited,cycle,top,i) == false) return new int[0];
        }
        
        return top;
        
    }
    
    public boolean dfs( Map<Integer,List<Integer>> map , Set<Integer> visited, Set<Integer> cycle, int[] top,int course){
        
        if(cycle.contains(course)) return false;
        
        if(visited.contains(course)) return true;
        
        cycle.add(course);
        
        List<Integer> mustCourses = map.getOrDefault(course, new ArrayList<>());
        
        for(int mustCourse : mustCourses){
            if(dfs(map,visited,cycle,top,mustCourse) == false) return false;
        }
        
        cycle.remove(course);
        visited.add(course);
        
        top[index++] = course;
        
        return true;
    }
    
}