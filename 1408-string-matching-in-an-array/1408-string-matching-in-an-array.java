class Solution {
    public static List<String> stringMatching(String[] words) {

        Set<String> set = new HashSet<>();

        for(int i = 0; i < words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                if(!words[i].equals(words[j]) && words[j].contains(words[i])) {
                    set.add(words[i]);
                }
            }
        }

        return set.stream().toList();
    }
}