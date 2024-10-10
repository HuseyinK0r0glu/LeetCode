class Solution {
    public int maxCoins(int[] piles) {
        
        int choosed = 0;
        int total = 0;
        
        Arrays.sort(piles);
        
        for(int i = piles.length-2;i>=0;i = i-2){
            total += piles[i];
            choosed++;
            if(choosed == piles.length/3){
                break;
            }
        }
        
        return total;
    }
}