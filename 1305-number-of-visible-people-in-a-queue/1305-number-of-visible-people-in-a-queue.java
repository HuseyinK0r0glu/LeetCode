import java.util.*;

class Solution {
    public int[] canSeePersonsCount(int[] heights) {

        // it will keep the indices of the heights in the array
        Stack<Integer> stack = new Stack<>();

        int[] res = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            boolean firstBigger = false;
            int lastIndex = -1;
            while(!stack.isEmpty() && !firstBigger) {
                int index = stack.pop();
                if(heights[index] > heights[i]){
                    lastIndex = index;
                    firstBigger = true;
                }
                res[index]++;
            }
            if(lastIndex != -1){
                stack.push(lastIndex);
            }
            stack.add(i);
        }
        return res;
    }
}