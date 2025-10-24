class Solution {
    public boolean checkDivisibility(int n) {

        int ourVal = n;
        
        int multiplicationVal = 1;
        int sumVal = 0;

        while(n != 0){
            int last = n % 10;
            multiplicationVal *= last;
            sumVal += last;
            n /= 10;
        }

        int sum = multiplicationVal + sumVal;

        return ourVal % sum == 0;

    }
}