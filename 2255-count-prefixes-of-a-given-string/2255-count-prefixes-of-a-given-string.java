class Solution {
    public static int countPrefixes(String[] words, String s) {

        int count = 0;

        for(String word : words) {

            if(word.length() <= s.length()){
                if(s.startsWith(word)) count++;
            }

        }

        return count;

    }
}