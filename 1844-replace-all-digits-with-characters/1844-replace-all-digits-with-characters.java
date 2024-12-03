class Solution {
    public static String replaceDigits(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                int temp = s.charAt(i-1) - 'a';
                int shifted = (temp + Integer.parseInt(String.valueOf(s.charAt(i)))) % 26;
                sb.append((char) (shifted + 'a'));
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}