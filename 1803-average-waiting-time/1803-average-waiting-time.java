import java.util.*;

class Solution {
    public double averageWaitingTime(int[][] customers) {

        double totalTime = 0;
        long currentTime = customers[0][0];

        for (int[] customer :  customers) {
            int arrivingTime = customer[0];
            int idleTime = customer[1];

            if(currentTime < arrivingTime){
                currentTime = arrivingTime;
            }
            
            currentTime += idleTime;

            totalTime += (currentTime - arrivingTime);

        }

        return totalTime / customers.length;
    }
}