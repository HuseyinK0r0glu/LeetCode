class Solution {
    public static String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0;i<num.length();i++){
            char current = num.charAt(i);
            while(!stack.isEmpty() && k > 0 && stack.peek() > current){
                stack.pop();
                k--;
            }
            if(!(stack.isEmpty() && current == '0')){
                stack.push(current);
            }
        }

        while(k > 0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        if(sb.isEmpty()) return "0";
        return sb.reverse().toString();
    }

}