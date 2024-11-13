class Solution {
    public static int prefixCount(String[] words, String pref) {

        int count = 0;

        for(String word : words) {

            if(pref.length() <= word.length()) {
                if(word.startsWith(pref)) count++;
            }

        }

        return count;
    }
}