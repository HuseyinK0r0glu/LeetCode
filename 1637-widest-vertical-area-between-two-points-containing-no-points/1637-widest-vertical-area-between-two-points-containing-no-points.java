class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        
        int[] rows = new int[points.length];
        
        for(int i = 0;i<points.length;i++){
            rows[i] = points[i][0];
        }
        
        Arrays.sort(rows);
        
        int max = 0;
        
        for(int i = 0;i<rows.length-1;i++){
            max = Math.max(max,rows[i+1]-rows[i]);
        }
     
        return max;
        
    }
}