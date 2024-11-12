class Solution {
    public static String makeGood(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(Character.isLowerCase(c)) {
                if(!stack.isEmpty() && stack.peek() == Character.toUpperCase(c)) {
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }else {
                if(!stack.isEmpty() && stack.peek() == Character.toLowerCase(c)) {
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}