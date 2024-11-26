class Solution {
    public static int findChampion(int n, int[][] edges) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < edges.length; i++) {
            set.add(edges[i][1]);
        }

        if(set.size() <= n-2) return -1;

        int champ = -1  ;

        for(int i = 0; i < n; i++) {
            if(!set.contains(i)) {
                champ = i;
                break;
            }
        }

        return champ;
    }
}