class Solution {
    public int minSwaps(String s) {
        
        int imbalance = 0;
        int open = 0;
        
        for(int i = 0;i<s.length();i++){
            
            if(s.charAt(i) == '['){
                open++;
            }else {
                if(open > 0){
                    open--;
                }else {
                    imbalance++;
                }
            }
            
        }
        
        return (imbalance+1) / 2;
    }
}