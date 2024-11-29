class Solution {
    public static String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder(s);

        for(int i = 0; i < result.length(); i++) {

            char current = result.charAt(i);

            if(current == '('){
                stack.push(i);
            }else if(current == ')'){
                if(stack.isEmpty()){
                    result.setCharAt(i,'*');
                }else {
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            result.setCharAt(stack.pop(),'*');
        }

        return result.toString().replace("*","");
    }
}