class Solution {
    public int minNumberOperations(int[] target) {

        int sum = target[0];
        Stack<Integer> stack = new Stack<>();
        stack.push(sum);
        
        for(int num : target) {
            int top = stack.peek();
            if(num > top){
                sum += num - top;
            }
            stack.push(num);
        }
        return sum;
    }
}