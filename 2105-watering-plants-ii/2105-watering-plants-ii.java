class Solution {
    public static int minimumRefill(int[] plants, int capacityA, int capacityB) {

        int refill = 0;

        if(plants.length % 2 == 0){

            int currentA = capacityA;
            int currentB = capacityB;

            for(int i = 0;i<plants.length/2;i++){
                if(currentA >= plants[i]){
                    currentA -= plants[i];
                }else {
                    refill++;
                    currentA = capacityA;
                    currentA -= plants[i];
                }
            }

            for(int i = plants.length - 1 ;i >= plants.length / 2;i--){
                if(currentB >= plants[i]){
                    currentB -= plants[i];
                }else {
                    refill++;
                    currentB = capacityB;
                    currentB -= plants[i];
                }
            }

        }else {
            int currentA = capacityA;
            int currentB = capacityB;

            for(int i = 0;i<plants.length/2;i++){
                if(currentA >= plants[i]){
                    currentA -= plants[i];
                }else {
                    refill++;
                    currentA = capacityA;
                    currentA -= plants[i];
                }
            }

            for(int i = plants.length -1 ;i > plants.length / 2;i--){
                if(currentB >= plants[i]){
                    currentB -= plants[i];
                }else {
                    refill++;
                    currentB = capacityB;
                    currentB -= plants[i];
                }
            }

            if(currentA == currentB){
                if(currentA == 0) refill++;
                else if(currentA < plants[plants.length / 2]) refill++;
            }else if(currentB > currentA){
                if(currentB < plants[plants.length / 2]) refill++;
            }else {
                if(currentA < plants[plants.length / 2]) refill++;
            }

        }
        return refill;
    }
}