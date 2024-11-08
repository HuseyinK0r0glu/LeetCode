class Solution {
    public int[] constructRectangle(int area) {
        
        int[] res = new int[2];
        
        int j = (int)Math.sqrt(area);
        int l = 1;
        int w = 1;
        int diff = Integer.MAX_VALUE;
        
        for(int i = 1;i<=j;i++){
            
            if(area % i == 0){
                
                j = area/i;
                
                if(Math.abs(i-j) < diff){
                    w = Math.min(i,j);
                    l = Math.max(i,j);
                }
                
            }
            
        }
        
        res[0] = l;
        res[1] = w;
        
        return res;
    }
}