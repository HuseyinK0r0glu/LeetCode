class Solution {
    public static int countAsterisks(String s) {

        int count = 0;
        boolean inside = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '|' && !inside) {
                inside = true;
            }else if(s.charAt(i) == '|' && inside) {
                inside = false;
            }else if(!inside){
                if(s.charAt(i) == '*') {
                    count++;
                }
            }
        }
        return count;

    }
}