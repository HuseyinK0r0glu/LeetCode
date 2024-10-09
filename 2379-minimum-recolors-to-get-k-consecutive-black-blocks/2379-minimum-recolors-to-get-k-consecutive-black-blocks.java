class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int min = blocks.length();
        
        for(int i = 0;i<=blocks.length()-k;i++){
            String sub = blocks.substring(i,i+k);
            int w = 0;
            for(int j = 0;j<k;j++){
                if(sub.charAt(j) == 'W'){
                    w++;
                }
            }
            
            if(w < min){
                min = w;
            }
        }
        
        return min;
        
    }
}