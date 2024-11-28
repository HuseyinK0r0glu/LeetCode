class Solution {
    public static boolean squareIsWhite(String coordinates) {

        if((int) coordinates.charAt(0) % 2 == 0){
            if(Integer.parseInt(String.valueOf(coordinates.charAt(1))) % 2 == 1) {
                return true;
            }else {
                return false;
            }
        }else {
            if(Integer.parseInt(String.valueOf(coordinates.charAt(1))) % 2 == 1) {
                return false;
            }else {
                return true;
            }
        }
    }

}