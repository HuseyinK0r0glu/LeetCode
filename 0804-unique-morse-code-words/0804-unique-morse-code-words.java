class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();

        for(String word : words) {

            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()) {
                sb.append(arr[c-'a']);
            }

            set.add(sb.toString());
        }

        return set.size();

    }
}