class Solution {
    public int[] getNoZeroIntegers(int n) {

        int[] result = new int[2];

        for(int i = 1; i < n; i++) {
            if(check(i) && check(n-i)) {
                result[0] = i;
                result[1] = n - i;
                break;
            }
        }

        return result;
    }
    
    public boolean check(int num){
        
        while(num > 0){
            int last = num % 10;
            if(last == 0){
                return false;
            }
            num /= 10;
        }
        
        return true;
    }
}