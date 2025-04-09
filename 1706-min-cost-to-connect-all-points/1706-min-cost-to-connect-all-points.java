class Solution {
    // key is the index of a point in the points 
        public class Edge{

        public int from;
        public int to;
        public int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

    }

    public int minCostConnectPoints(int[][] points) {

        List<Edge> edges = new ArrayList<>();
        int[] parent = new int[points.length];

        for(int i = 0; i < points.length; i++){
            parent[i] = i;
            for(int j = i+1; j < points.length; j++){
                edges.add(new Edge(i,j,calculateDistance(points[i],points[j])));
            }
        }

        edges.sort(Comparator.comparingInt(edge -> edge.weight));

        int count = 0;
        int cost = 0;
        
        for(Edge edge : edges){
            
            if(union(parent,edge.from,edge.to)){
                cost += edge.weight;
                count++;
                if(count == points.length-1){
                    break;
                }
            }
        }
        
        return cost;
    }
    
    public boolean union(int[] parent , int a ,int b){
        int root1 = find(parent, a);
        int root2 = find(parent, b);
        
        if(root1 == root2){
            return false;
        }
        
        parent[root1] = root2;
        return true;
    }

    public int find(int[] parent , int a){
        
        if(a == parent[a]){
            return a;
        }
    
        return find(parent,parent[a]);
    }
    
    
    public int calculateDistance(int[] point1, int[] point2) {

        int xDifference = Math.abs(point1[0] - point2[0]);
        int yDifference = Math.abs(point1[1] - point2[1]);

        return xDifference + yDifference;
    }

    // key is the coordinates 
/*        public class Edge{

        public int[] from;
        public int[] to;
        public int weight;

        public Edge(int[] from, int[] to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

    }

    public int minCostConnectPoints(int[][] points) {

        List<Edge> edges = new ArrayList<>();
        Map<List<Integer>,int[]> parent = new HashMap<>();

        for(int i = 0; i < points.length; i++){
            parent.put(Arrays.asList(points[i][0],points[i][1]),points[i]);
            for(int j = 0; j < points.length; j++){
                edges.add(new Edge(points[i],points[j],calculateDistance(points[i],points[j])));
            }
        }

        edges.sort(Comparator.comparingInt(edge -> edge.weight));

        int cost = 0;
        int count = 0;

        for(Edge edge : edges){
            if(union(parent,edge.from,edge.to)){
                cost += edge.weight;
                count++;
                if(count == points.length-1){
                    break;
                }
            }
        }

        return cost;
    }

    public boolean union(Map<List<Integer>,int[]> parent, int[] a,int[] b){

        int[] parent1 = find(parent,a);
        int[] parent2 = find(parent,b);

        if(parent1[0] == parent2[0] && parent1[1] == parent2[1]){
            return false;
        }

        parent.put(Arrays.asList(parent1[0],parent1[1]),parent2);
        return true;
    }

    public int[] find(Map<List<Integer>,int[]> parent,int[] a){
        List<Integer> key = Arrays.asList(a[0],a[1]);
        int[] parentOfA = parent.get(key);
        if(parentOfA[0] == a[0] && parentOfA[1] == a[1]){
            return parentOfA;
        }
        
        return find(parent,parentOfA);
    }

    public int calculateDistance(int[] point1, int[] point2) {

        int xDifference = Math.abs(point1[0] - point2[0]);
        int yDifference = Math.abs(point1[1] - point2[1]);

        return xDifference + yDifference;
    }*/
}