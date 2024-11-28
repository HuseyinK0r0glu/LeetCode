class Solution {
    public static List<String> stringSequence(String target) {

        List<String> result = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<target.length();i++) {

            char c = target.charAt(i);
            char current = 'a';
            while(current != c){
                sb.append(current);
                result.add(sb.toString());
                current = (char)(current + 1);
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(current);
            result.add(sb.toString());
        }
        return result;
    }
}