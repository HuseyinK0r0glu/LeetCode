class Solution {
    public static int numberOfSteps(int num) {

        int step = 0;

        while(num > 0){
            if(num % 2 == 0){
                num = (num >> 1);
            }else {
                num -= 1;
            }
            step++;
        }
        return step;
    }
}