class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {

        int distance = 0;
        int used = 0;
        
        while(mainTank > 0){
            distance += 10;
            mainTank--;
            used++;
            if(used == 5){
                used = 0;
                if(additionalTank > 0){
                    additionalTank--;
                    mainTank++;
                }
            }
        }
        
        return distance;
    }
}