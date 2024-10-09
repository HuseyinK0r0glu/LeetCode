class Solution {
    public int minAddToMakeValid(String s) {
        
        if(s.equals("")){
            return 0;
        }
        
        int open = 0;
        int swap = 0;
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                open++;
            }else {
                if(open > 0){
                    open--;
                }else {
                    swap++;
                }
            }
        }
        
        return swap + open;
    }
}