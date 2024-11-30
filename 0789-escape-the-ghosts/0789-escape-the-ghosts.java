class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {

        int distanceToTarget = Math.abs(target[0]) + Math.abs(target[1]);
        
        int minGhostDistance = Integer.MAX_VALUE;
        
        for(int[] ghost : ghosts) {
            int distance = distance(ghost, target);
            minGhostDistance = Math.min(minGhostDistance, distance);
        }
        
        return distanceToTarget < minGhostDistance;
    }

    public int distance(int[] start,int[] end){
        return Math.abs(start[0] - end[0]) + Math.abs(start[1] - end[1]);
    }
}