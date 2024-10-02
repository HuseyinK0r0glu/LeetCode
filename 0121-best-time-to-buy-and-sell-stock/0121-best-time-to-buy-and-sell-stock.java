class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int minPrice = 10000;
            
        
        for(int i = 0;i<prices.length;i++){
            
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }else {
                int profit = prices[i] - minPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
            
        }
        
        return maxProfit;
    }
}