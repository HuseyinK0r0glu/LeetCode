class Solution {
    public int vowelStrings(String[] words, int left, int right) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int count = 0;
        
        for(int i = left; i <= right; i++){
            if(vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length()-1))){
                count++;
            }
        }

        return count;
    }
}