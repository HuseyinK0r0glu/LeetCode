class Solution {
    public long minimumSteps(String s) {
        
        long result = 0;
        
        int counter = 0;
        
        for(int i = s.length() - 1;i>=0;i--){
            if(s.charAt(i) == '0'){
                counter++;
            }
            
            if(s.charAt(i) == '1'){
                result += counter;
            }
        }
        
        return result;
        
        
    }
}