class Solution {
    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '#') {
                if(!stack1.isEmpty()) stack1.pop();
            }else {
                stack1.push(c);
            }
        }

        for(char c : t.toCharArray()) {
            if(c == '#') {
                if(!stack2.isEmpty()) stack2.pop();
            }else {
                stack2.push(c);
            }
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while(!stack1.isEmpty()) {
            sb1.append(stack1.pop());
        }

        while(!stack2.isEmpty()) {
            sb2.append(stack2.pop());
        }

        return sb1.reverse().toString().contentEquals(sb2.reverse());
    }
}