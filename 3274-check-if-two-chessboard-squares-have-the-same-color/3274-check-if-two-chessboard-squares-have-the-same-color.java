class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        String color1 = "";
        String color2 = "";

        if((int) coordinate1.charAt(0) % 2 == 0){
            if(Integer.parseInt(String.valueOf(coordinate1.charAt(1))) % 2 == 1) {
                color1 = "White";
            }else {
                color1 = "Black";
            }
        }else {
            if(Integer.parseInt(String.valueOf(coordinate1.charAt(1))) % 2 == 1) {
                color1 = "Black";
            }else {
                color1 = "White";
            }
        }

        if((int) coordinate2.charAt(0) % 2 == 0){
            if(Integer.parseInt(String.valueOf(coordinate2.charAt(1))) % 2 == 1) {
                color2 = "White";
            }else {
                color2 = "Black";
            }
        }else {
            if(Integer.parseInt(String.valueOf(coordinate2.charAt(1))) % 2 == 1) {
                color2 = "Black";
            }else {
                color2 = "White";
            }
        }

        return color1.equals(color2);

    }
}