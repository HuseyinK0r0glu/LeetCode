class Solution {
    public int secondHighest(String s) {
        
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for(int i = 0;i<s.length();i++){
            
            char c = s.charAt(i);
            
            if(Character.isDigit(c)){
                
                int value = c - '0';
                
                if(value > first){
                    second = first;
                    first = value;
                }else if(value < first && value > second){
                    second = value;
                }
                
            }
            
        }
        
        if(second == Integer.MIN_VALUE) return -1;
        
        return second;
        
    }
}