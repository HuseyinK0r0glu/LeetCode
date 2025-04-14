class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        Set<Integer> placesBasket = new HashSet<>();
        int res = 0;
        
        for(int fruit : fruits) {
            boolean placed = false;
            for(int i = 0; i < baskets.length; i++) {
                if(fruit <= baskets[i] && !placesBasket.contains(i)) {
                    placesBasket.add(i);
                    placed = true;
                    break;
                }
            }
            if(!placed) {
                res++;
            }
        }
        
        return res;
    }
}