class Solution {
    public int calculate(String s) {
        
        Stack<Integer> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        
        s = s.replaceAll(" ","");
        
        Map<String,Integer> map = new HashMap<>();
        map.put("*",1);
        map.put("/",1);
        map.put("+",0);
        map.put("-",0);

        
        for(int i = 0;i<s.length();i++){
            
            char token = s.charAt(i);
            
            if (Character.isDigit(token)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                operand.push(num);
                i--;
            } 
            
            else if(token == '('){
                operator.push("(");
            }
            
            else if(token == ')'){
                while(!operator.isEmpty() && !operator.peek().equals("(")){
                    
                    String op = operator.pop(); 
                    
                    int o2 = operand.pop();
                    int o1 = operand.isEmpty() ? 0 : operand.pop();
                    
                    operand.push(evaluate(op,o1,o2));
                    
                }
                if (!operator.isEmpty()) {
                    operator.pop();
                }
            }
            else if (token == '-' && (i == 0 || !Character.isDigit(s.charAt(i - 1)) && s.charAt(i - 1) != ')')){
                    
                    operator.push("*"); // Push '*' for multiplication
                    operand.push(-1);    // Push -1 to negate the next number or expression
                }
            
            else {
                while(!operator.isEmpty() && map.containsKey(operator.peek()) && map.containsKey(String.valueOf(token)) &&                                          map.get(operator.peek()) >= map.get(String.valueOf(token))){
                    
                    String op = operator.pop(); 
                    
                    int o2 = operand.pop();
                    int o1 = operand.isEmpty() ? 0 : operand.pop();
                    
                    operand.push(evaluate(op,o1,o2));
                }
                
                operator.push(String.valueOf(token));
            }
        }
        
        while(!operator.isEmpty()){
            String op = operator.pop(); 

            int o2 = operand.pop();
            int o1 = operand.isEmpty() ? 0 : operand.pop();

            operand.push(evaluate(op,o1,o2));
        }
        
        return operand.pop();
    }
    
    
    public int evaluate(String op,int o1,int o2){
        int result = 0;

        if(op.equals("*")){
            result = o1 * o2;
        }
        if(op.equals("/")){
            result = o1 / o2;
        }
        if(op.equals("+")){
            result = o1 + o2;
        }
        if(op.equals("-")){
            result = o1 - o2;
        }
        
        return result;
        
    }
}