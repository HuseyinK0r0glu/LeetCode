class Solution {
    public String decodeMessage(String key, String message) {

        Map<Character , Character> map = new HashMap<>();

        int index = 0;

        for(char c : key.toCharArray()){
            if(c == ' ') continue;
            if(map.containsKey(c)) continue;

            map.put(c , (char) ('a' + index));
            index++;
        }

        StringBuilder sb = new StringBuilder();

        for(char c : message.toCharArray()){
            if(c == ' '){
                sb.append(' ');
            }else {
                sb.append(map.get(c));
            }
        }
        return sb.toString();
    }
}