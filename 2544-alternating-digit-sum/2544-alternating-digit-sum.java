class Solution {
    public int alternateDigitSum(int n) {

        int res = 0;
        int multiplier = 1;

        List<Integer> digits = new ArrayList<>();

        while(n > 0){
            digits.add(n % 10);
            n /= 10;
        }

        Collections.reverse(digits);

        for(int digit : digits){
            res += digit * multiplier;
            multiplier *= -1;
        }

        return res;
    }
}