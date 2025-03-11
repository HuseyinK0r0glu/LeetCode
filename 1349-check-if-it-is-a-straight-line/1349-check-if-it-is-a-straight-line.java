class Solution {
    public boolean checkStraightLine(int[][] coordinates) {

        if((coordinates[1][0] - coordinates[0][0]) == 0){
            int x = coordinates[0][0];
            for(int i = 2; i < coordinates.length; i++){
                if(coordinates[i][0] != x){
                    return false;
                }
            }
            return true;
        }

        double slope = (double) (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);

        for(int i = 2; i < coordinates.length; i++) {
            if((coordinates[i][0] - coordinates[i-1][0]) == 0) return false;
            double newSlope = (double) (coordinates[i][1] - coordinates[i-1][1]) / (coordinates[i][0] - coordinates[i-1][0]);
            if(newSlope != slope) {
                return false;
            }
        }

        return true;
    }
}