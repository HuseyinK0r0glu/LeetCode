class Solution {
    public int countBeautifulPairs(int[] nums) {

        int totalPair = 0;
        for(int i = 0; i < nums.length; i++){
            int firstDigit = nums[i];
            while(firstDigit >= 10){
                firstDigit /= 10;
            }
            for(int j = i + 1; j < nums.length; j++){
                if(gcd(firstDigit, nums[j] % 10) == 1){
                    totalPair++;
                }
            }
        }
        return totalPair;
    }

    public int gcd(int i, int j) {

        if(j == 0) return i;

        return gcd(j,i % j);
    }
}