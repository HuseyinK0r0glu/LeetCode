class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder first = new StringBuilder();
        StringBuilder second = new StringBuilder();
        StringBuilder target = new StringBuilder();

        for(char c : firstWord.toCharArray()){
            first.append(c - 'a');
        }

        for(char c : secondWord.toCharArray()){
            second.append(c - 'a');
        }

        for(char c : targetWord.toCharArray()){
            target.append(c - 'a');
        }

        return Integer.parseInt(first.toString()) + Integer.parseInt(second.toString()) == Integer.parseInt(target.toString());
    }
}