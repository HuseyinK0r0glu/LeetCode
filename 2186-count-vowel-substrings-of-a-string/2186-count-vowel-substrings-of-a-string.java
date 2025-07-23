class Solution {
    public int countVowelSubstrings(String word) {
        int res = 0;

        for(int i = 0; i < word.length(); i++) {
            for(int j = i + 1; j < word.length(); j++) {
                if(check(word.substring(i, j+1))) {
                    res++;
                }
            }
        }

        return res;
    }

    public boolean check(String subString) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        Set<Character> contains = new HashSet<>();

        for  (char c : subString.toCharArray()) {
            if(!set.contains(c)) {
                return false;
            }
            contains.add(c);
        }
        
        return contains.size() == 5;
    }
}