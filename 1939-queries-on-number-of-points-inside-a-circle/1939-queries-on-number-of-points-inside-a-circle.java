class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {

        int[] result = new int[queries.length];
        
        int index = 0;
        for(int [] query : queries) {
            int x = query[0];
            int y = query[1];
            int r = query[2];
            
            int pointNum = 0;
            
            for(int [] point : points) {
                int px = point[0];
                int py = point[1];
                
                if(Math.sqrt(Math.pow(px - x, 2) + Math.pow(py - y, 2)) <= r) {
                    pointNum++;
                }
            }
            
            result[index++] = pointNum;
        } 
        
        return result;
    }
}