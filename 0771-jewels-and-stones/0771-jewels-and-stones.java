class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        String[] j = jewels.split("");
        String[] s = stones.split("");
        
        int result = 0;
        
        for(String curr : s){
            
            for(String currj : j){
                
                if(curr.equals(currj)){
                    result++;
                    break;
                }
                
            }
            
        }
        
            
        return result ;
    }
}