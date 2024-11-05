class Solution {
    public int minChanges(String s) {
        
        int total = 0;
        
        for(int i = 0;i<s.length();i += 2){
            
            int zeros = 0;
            int ones = 0;
            
            for(int j = i;j<i+2;j++){
                if(s.charAt(j) == '0') zeros++;
                if(s.charAt(j) == '1') ones++;
            }
            
            if(zeros - ones == 0) total += 1;
            
        }
        
        return total;
    }
}