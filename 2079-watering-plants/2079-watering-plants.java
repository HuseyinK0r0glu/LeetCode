class Solution {
    public static int wateringPlants(int[] plants, int capacity) {

        int steps = 0;

        int current = capacity;

        for(int i = 0;i<plants.length;i++){
            if(current >= plants[i]){
                steps++;
                current -= plants[i];
            }else {
                steps += 2 * i + 1;
                current = capacity - plants[i];
            }
        }

        return steps;
    }
}