class Solution {
    public static String truncateSentence(String s, int k) {

        String[] strings = s.split(" ");

        StringBuilder sb = new StringBuilder();

        int index = 0;

        while(k > 0){
            sb.append(strings[index++]);
            sb.append(" ");
            k--;
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}