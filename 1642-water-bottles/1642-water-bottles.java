class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int totalDrinks = 0;
        int emptyBottles = 0;
        
        while(numBottles > 0) {
            numBottles--;
            emptyBottles++;
            totalDrinks++;
            if(emptyBottles >= numExchange) {
                emptyBottles = 0;
                numBottles++;
            }
        }
        
        return totalDrinks;
    }
}