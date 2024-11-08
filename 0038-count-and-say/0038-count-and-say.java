class Solution {
    public String countAndSay(int n) {
        
        String s = "1";
        
        while(n>1){
            StringBuilder sb = new StringBuilder();
            int i = 0;
            
            while(i<s.length()){
                
                char c = s.charAt(i);
                int count = 0;
                
                while(i<s.length() && s.charAt(i) == c){
                    count++;
                    i++;
                }
                
                sb.append(count);
                sb.append(c);
            }
            
            s = sb.toString();
            n--;
        }
        
        return s;
    }
    
    
}