class Solution {
    public String makeFancyString(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<s.length();i++){
                
            sb.append(s.charAt(i));
            
            if(sb.length() >=3 && sb.charAt(sb.length() -1 ) == sb.charAt(sb.length() - 2) && sb.charAt(sb.length() -2) == sb.charAt(sb.length() - 3)){
                sb.deleteCharAt(sb.length() - 1);
            }
                
                
        }
        
        return sb.toString();
    }
}