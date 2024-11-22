class Solution {
    public static int numOfStrings(String[] patterns, String word) {

        int total = 0;

        for(String pattern : patterns) {
            if(word.contains(pattern)) total++;
        }

        return total;
    }
}