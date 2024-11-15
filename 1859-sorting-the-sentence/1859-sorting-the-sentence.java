class Solution {
    public static String sortSentence(String s) {

        String[] words = s.split(" ");

        StringBuilder sb = new StringBuilder();

        Arrays.sort(words,(a,b) -> Integer.compare
                    (Integer.parseInt(String.valueOf(a.charAt(a.length()-1)))
                     ,Integer.parseInt(String.valueOf(b.charAt(b.length()-1)))));

        for(String word : words) {
            sb.append(word, 0, word.length()-1);
            sb.append(" ");
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}