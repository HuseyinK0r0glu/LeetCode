class Solution {
    public static String reversePrefix(String word, char ch) {
        Stack<Character> reverseStack = new Stack<>();
        Stack<Character> stack = new Stack<>();

        boolean found = false;

        for(char c : word.toCharArray()) {
            if(found){
                stack.push(c);
            }else {
                reverseStack.push(c);
            }

            if(c == ch) {
                found = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!reverseStack.isEmpty()) {
            sb.append(reverseStack.pop());
        }

        StringBuilder sb2 = new StringBuilder();

        while(!stack.isEmpty()) {
            sb2.append(stack.pop());
        }

        if(!found) return sb.reverse().toString();
        
        return sb.toString() + sb2.reverse().toString();
    }
}