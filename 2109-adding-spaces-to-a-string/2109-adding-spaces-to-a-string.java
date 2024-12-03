class Solution {
    public String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder();
        int prev = 0;

        for(int place : spaces) {
            sb.append(s, prev, place);
            sb.append(' ');
            prev = place;
        }

        sb.append(s, prev, s.length());

        return sb.toString();
    }
}