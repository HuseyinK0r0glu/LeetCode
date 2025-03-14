class Solution {
    public boolean isValid(String word) {

        if(word.length() < 3){
            return false;
        }

        Set<Character> vowels = new HashSet<>();

        for (char c : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}) {
            vowels.add(c);
        }

        boolean containsVowel = false;
        boolean containsConsonant = false;

        for(char c : word.toCharArray()){
            if(!(Character.isLetter(c) || Character.isDigit(c))){
                return false;
            }

            if(Character.isDigit(c)) continue;

            if(vowels.contains(c)){
                containsVowel = true;
            }else {
                containsConsonant = true;
            }
        }

        return containsVowel && containsConsonant;
    }
}