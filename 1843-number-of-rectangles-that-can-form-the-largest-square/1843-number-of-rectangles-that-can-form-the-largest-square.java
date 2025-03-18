class Solution {
    public int countGoodRectangles(int[][] rectangles) {

        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        
        for(int [] rectangle : rectangles) {
            int width = rectangle[0];
            int height = rectangle[1];
            int min = Math.min(width, height);
            
            max = Math.max(max,min);
            map.put(min,map.getOrDefault(min,0)+1);
        }
        
        return map.getOrDefault(max,0);
    }
}