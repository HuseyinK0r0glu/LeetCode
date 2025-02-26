class Solution {
    public String freqAlphabets(String s) {

        Map<String, Character> map = new HashMap<>();

        // Mapping '1' to '9' -> 'a' to 'i'
        for (int i = 1; i <= 9; i++) {
            map.put(String.valueOf(i), (char) ('a' + (i - 1)));
        }

        // Mapping '10#' to '26#' -> 'j' to 'z'
        for (int i = 10; i <= 26; i++) {
            map.put(i + "#", (char) ('a' + (i - 1)));
        }

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < s.length()){
            if(i + 2 < s.length() && s.charAt(i+2) == '#'){
                String temp = s.substring(i, i+3);
                sb.append(map.get(temp));
                i = i + 3 ;
            }else {
                sb.append(map.get(String.valueOf(s.charAt(i))));
                i++;
            }
        }

        return sb.toString();
    }
}