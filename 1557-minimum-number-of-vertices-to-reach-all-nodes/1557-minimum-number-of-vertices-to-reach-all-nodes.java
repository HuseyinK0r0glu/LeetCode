class Solution {
    public static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> dest = new HashSet<>();

        for(int i=0; i<edges.size(); i++) {
            int from = edges.get(i).get(0);
            int to = edges.get(i).get(1);
            set.add(from);
            set.add(to);
            dest.add(to);
        }

        List<Integer> res = new ArrayList<>();

        for(int temp : set) {
            if(!dest.contains(temp)) res.add(temp);
        }

        return res;
    }
}