class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        int total = 0;
        while(numOnes > 0 && k > 0){
            total++;
            numOnes--;
            k--;
        }

        if(k == 0) return total;
        
        while(numZeros > 0 && k > 0){
            numZeros--;
            k--;
        }

        if(k == 0) return total;
        
        while(numNegOnes > 0 && k > 0){
            total--;
            numNegOnes--;
            k--;
        }
        return total;
    }
}