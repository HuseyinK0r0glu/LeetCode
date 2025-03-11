class Solution {
    private int maxScore = 0;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {

        Map<Character,Integer> charFreq = new HashMap<>();
        for(char c : letters) {
            charFreq.put(c,charFreq.getOrDefault(c,0) + 1);
        }

        backtrack(0,words,score,charFreq,new ArrayList<String>(),0,letters.length);

        return maxScore;
    }

    public void backtrack(int index,String[] words, int[] scores, Map<Character,Integer> charFreq,List<String> list,int currentLetters,int totalLetters) {

        if(currentLetters <= totalLetters) {
            int score = 0;
            Map<Character,Integer> map = new HashMap<>(charFreq);
            for(String word : list) {
                for(char c : word.toCharArray()) {
                    if(!map.containsKey(c) || map.get(c) == 0){
                        return;
                    }
                    score += scores[c - 'a'];
                    map.put(c,map.getOrDefault(c,0) - 1);
                }
            }
            maxScore = Math.max(maxScore,score);
        }

        for(int i = index;i<words.length;i++) {
            String word = words[i];
            list.add(word);
            backtrack(i+1,words, scores, charFreq, list,currentLetters + word.length(),totalLetters);
            list.remove(list.size() - 1);
        }
    }
}