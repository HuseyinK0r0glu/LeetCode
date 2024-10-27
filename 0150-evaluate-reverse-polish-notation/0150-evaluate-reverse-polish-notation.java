class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(String token : tokens){
            
            if(token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-")){
                
                int o2 = stack.pop();
                int o1 = stack.pop();
                
                int result = 0;
                
                if(token.equals("*")){
                    result = o1 * o2;
                }
                if(token.equals("/")){
                    result = o1 / o2;
                }
                if(token.equals("+")){
                    result = o1 + o2;
                }
                if(token.equals("-")){
                    result = o1 - o2;
                }
                
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(token));
            }
            
            
        }
        
        return stack.pop();
        
    }
}