class Solution {
    public static int passThePillow(int n, int time) {

        int pillow = 1;
        int direction = 1;

        for(int i = 1;i<time;i++) {
            pillow += direction;

            if (pillow == n) direction = -1;
            else if (pillow == 1) direction = 1;
        }
        return pillow + direction;
    }
}