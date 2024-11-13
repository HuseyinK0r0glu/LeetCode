class Solution {
    public static String mostCommonWord(String paragraph, String[] banned) {

        Map<String,Integer> map = new HashMap<>();

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        String[] words = paragraph.toLowerCase().split("[^a-z]+");

        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        String res = "";
        int max = Integer.MIN_VALUE;

        for(String word : map.keySet()) {
            if(map.get(word) > max) {
                max = map.get(word);
                res = word;
            }
        }
        return res;
    }
}