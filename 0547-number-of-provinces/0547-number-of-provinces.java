class Solution {
    public static int findCircleNum(int[][] isConnected) {

        boolean[] visited = new boolean[isConnected.length];
        int layer = 0;

        for(int i = 0; i < isConnected.length; i++) {
            if(!visited[i]) {
                layer++;
                dfs(isConnected,i,visited);
            }
        }

        return layer;

    }

    public static void dfs(int[][] isConnected,int city,boolean[] visited){
        visited[city] = true;
        for(int i = 0; i < isConnected.length; i++) {
            if(isConnected[city][i] == 1 && !visited[i]) {
                dfs(isConnected,i,visited);
            }
        }

    }
}