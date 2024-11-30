class Solution {
    public int maxVowels(String s, int k) {

        if(s.length() < k) return 0;

        int left = 0;
        int right = left + k;

        int vowels = 0;

        for(int i = 0;i<k;i++){
            if(checkVowels(s.charAt(i))) vowels++;
        }

        int max = vowels;

        for(int i = k;i<s.length();i++){

            if(checkVowels(s.charAt(i))) vowels++;
            if(checkVowels(s.charAt(i - k))) vowels--;

            max = Math.max(max, vowels);

        }

        return max;
    }
    
    public boolean checkVowels(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
}   