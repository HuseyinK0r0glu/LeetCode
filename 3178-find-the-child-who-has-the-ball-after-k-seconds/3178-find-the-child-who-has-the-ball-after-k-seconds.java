class Solution {
    public static int numberOfChild(int n, int k) {

        int current = 0;
        int direction = 1;

        for(int i = 0;i<k;i++){
            current += direction;
            if(current == 0 || current == n-1){
                direction *= -1;
            }
        }
        return current;
    }
}   