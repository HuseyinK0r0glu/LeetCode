class Solution {
    public String toGoatLatin(String sentence) {
        
        String[] words = sentence.split(" ");
    
        StringBuilder sb = new StringBuilder();
    
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(vowels.contains(word.charAt(0))) {
                sb.append(word);
                sb.append("ma");
            }else {
                sb.append(word, 1, word.length());
                sb.append(word.charAt(0));
                sb.append("ma");
            }
            sb.repeat('a',i+1);
            if(i != words.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
        
    }
}