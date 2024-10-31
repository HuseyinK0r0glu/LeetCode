class Solution {
    public boolean digitCount(String num) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        String val = String.valueOf(num);
        
        for(int i = 0;i<val.length();i++){
            char c = val.charAt(i);
            map.put(c - '0',map.getOrDefault(c - '0',0) + 1);
        }
        
        for(int i = 0;i<val.length();i++){
            int count = map.getOrDefault(i,0);
            
            if (count != (num.charAt(i) - '0')) {
                return false; 
            }
        }
        
        return true;
    }
}