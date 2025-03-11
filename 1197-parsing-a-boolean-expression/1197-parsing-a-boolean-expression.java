class Solution {
    public boolean parseBoolExpr(String expression) {

        Stack<Character> stack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for(char c : expression.toCharArray()) {
            if (c == ',') {
                continue;
            }

            if(c == '|' || c == '&' || c == '!') {
                operatorStack.push(c);
                continue;
            }

            if(c == '(') {
                stack.push('(');
                continue;
            }

            if(c == ')') {
                List<Character> values = new ArrayList<>();
                while(!stack.isEmpty() && stack.peek() != '(') {
                    values.add(stack.pop());
                }
                stack.pop();
                char operator = operatorStack.pop();
                boolean result = false;
                if(operator == '&') {
                    result = andOperator(values);
                }else if(operator == '|') {
                    result = orOperator(values);
                }else {
                    result = notOperator(values);
                }
                if(result) {
                    stack.push('t');
                }else {
                    stack.push('f');
                }
                continue;
            }

            stack.push(c);
        }

        if(!stack.isEmpty() && stack.peek() == 't') {
            return true;
        }
        return false;
    }

    public boolean notOperator(List<Character> list) {
        if(list.get(0) == 'f'){
            return true;
        }
        return false;
    }

    public boolean andOperator(List<Character> list) {
        for(char c : list){
            if(c == 'f'){
                return false;
            }
        }
        return true;
    }

    public boolean orOperator(List<Character> list) {
        for(char c : list){
            if(c == 't'){
                return true;
            }
        }
        return false;
    }
}