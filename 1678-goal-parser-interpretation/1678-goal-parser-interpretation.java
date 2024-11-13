class Solution {
    public String interpret(String command) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<command.length();i++){
            
            if(command.charAt(i) == 'G') sb.append("G");
            else if(command.charAt(i) == '('){
                if(i != command.length()-1 && command.charAt(i+1) == ')') sb.append("o"); 
                if(i != command.length()-1 && command.charAt(i+1) == 'a') sb.append("al");
            } 
        }
        
        return sb.toString();
    }
}