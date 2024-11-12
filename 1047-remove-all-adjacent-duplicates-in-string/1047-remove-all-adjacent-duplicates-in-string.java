class Solution {
    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(stack.isEmpty() || c != stack.peek()){
                stack.push(c);
            }else if(c == stack.peek()){
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}