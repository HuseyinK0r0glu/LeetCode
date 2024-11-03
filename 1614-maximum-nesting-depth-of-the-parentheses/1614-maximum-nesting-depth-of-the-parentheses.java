class Solution {
    public int maxDepth(String s) {
        
        int max = 0;
        int curr = 0;
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                curr++;
            }
            
            else if(s.charAt(i) == ')'){
                max = Math.max(max,curr);
                curr--;
            }
        }
        
        return max;
    }
}