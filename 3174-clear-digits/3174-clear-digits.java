class Solution {
    public static String clearDigits(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            if(Character.isDigit(c)) {
                if(!stack.isEmpty()) stack.pop();
            }else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}