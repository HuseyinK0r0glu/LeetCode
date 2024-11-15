class Solution {
    public static String sortVowels(String s) {

        List<Character> list = new ArrayList<>();

        for(char c : s.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                list.add(c);
            }
        }

        Collections.sort(list);

        int index = 0;

        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {

            char lower = Character.toLowerCase(c);

            if(lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                sb.append(list.get(index++));
            }else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}