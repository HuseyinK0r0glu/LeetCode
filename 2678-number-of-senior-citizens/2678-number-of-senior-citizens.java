class Solution {
    public static int countSeniors(String[] details) {

        int total = 0;

        for(String s : details) {
            if(10 * Integer.parseInt(String.valueOf(s.charAt(11))) +
                    Integer.parseInt(String.valueOf(s.charAt(12)))> 60) total++;
        }

        return total;
    }
}