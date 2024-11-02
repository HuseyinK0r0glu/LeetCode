class Solution {
    public char findKthBit(int n, int k) {
        
        String s = "0";
    
        while(n>0){
            
            s = s + "1" + reverse(inverse(s));
            
            n--;
        }
        
        return s.charAt(k-1);
        
    }
    
    public String reverse(String s){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
    
    public String inverse(String s){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                sb.append("1");
            }else {
                sb.append("0");
            }
        }
        
        return sb.toString();
        
    }
    
}