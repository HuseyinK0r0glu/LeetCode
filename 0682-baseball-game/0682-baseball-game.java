class Solution {
    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for(String op : operations) {
            if(op.equals("C")){
                if(!stack.isEmpty()) stack.pop();
            }else if(op.equals("D")){
                stack.push(stack.peek() * 2);
            }else if(op.equals("+")){
                if(stack.size() >= 2){
                    int first = stack.pop();
                    int second = stack.pop();
                    stack.push(second);
                    stack.push(first);
                    stack.push(first + second);
                }
            }else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}