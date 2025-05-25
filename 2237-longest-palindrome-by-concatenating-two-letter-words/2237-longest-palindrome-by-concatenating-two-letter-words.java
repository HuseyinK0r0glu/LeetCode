import java.util.*;

class Solution {
    public int longestPalindrome(String[] words) {

        int longest = 0;

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        Set<String> visited = new HashSet<>();

        boolean middle = false;

        for(String word : map.keySet()) {
            if(visited.contains(word)) {
                continue;
            }
            visited.add(word);

            if(word.charAt(0) == word.charAt(1)) {
                int val = map.get(word);

                if(val == 1 && !middle) {
                    middle = true;
                    longest += 2;
                    continue;
                }

                if(val % 2 == 0){
                    longest += val * 2;
                }else {
                    longest += (val-1) * 2;
                    if(val % 2 == 1 && !middle) {
                        middle = true;
                        longest += 2;
                    }
                }
            }else {
                String reversedWord = new StringBuilder(word).reverse().toString();
                int lowest = Math.min(map.get(word),map.getOrDefault(reversedWord, 0));
                longest += lowest * 4;
                visited.add(reversedWord);
            }
        }

        return longest;
    }
}