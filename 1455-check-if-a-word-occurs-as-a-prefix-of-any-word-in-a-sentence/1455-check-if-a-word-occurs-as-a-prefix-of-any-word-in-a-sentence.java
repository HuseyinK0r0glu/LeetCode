class Solution {
    public static int isPrefixOfWord(String sentence, String searchWord) {

        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(searchWord.length() <= word.length()){
                if(word.startsWith(searchWord)){
                    return i+1;
                }
            }

        }

        return -1;
    }
}