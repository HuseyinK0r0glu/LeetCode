class Solution {
    public String reformat(String s) {

        List<Character> letters = new ArrayList<>();
        List<Character> digits = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                digits.add(c);
            }else {
                letters.add(c);
            }
        }

        if(letters.size() > digits.size() + 1) {
            return "";
        }

        if(digits.size() > letters.size() + 1) {
            return "";
        }

        if (digits.size() > letters.size()) {
            List<Character> temp = letters;
            letters = digits;
            digits = temp;
        }

        StringBuilder sb = new StringBuilder();
        int letterIndex = 0;
        int digitIndex = 0;

        while(letterIndex < letters.size() && digitIndex < digits.size()) {
            sb.append(letters.get(letterIndex));
            sb.append(digits.get(digitIndex));
            letterIndex++;
            digitIndex++;
        }

        if(letterIndex < letters.size()) {
            sb.append(letters.get(letterIndex));
        }

        if(digitIndex < digits.size()) {
            sb.append(digits.get(digitIndex));
        }

        return sb.toString();

    }
}