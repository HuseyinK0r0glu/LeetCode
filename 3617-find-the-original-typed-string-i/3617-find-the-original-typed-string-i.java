class Solution {
    public int possibleStringCount(String word) {

        int res = 1;
        int index = 0;
        
        while (index < word.length()) {
            char current = word.charAt(index);
            int cons = 0;
            while(index < word.length() && word.charAt(index) == current) {
                index++;
                cons++;
            }
            
            if(cons > 1){
                res += cons - 1;
            }
            
        }
        
        return res;
    }
}