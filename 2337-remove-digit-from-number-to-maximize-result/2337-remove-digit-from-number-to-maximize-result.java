class Solution {
    public String removeDigit(String number, char digit) {

        String max = "";

        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) == digit) {
                String temp = number.substring(0, i) + number.substring(i + 1);
                if(max.isEmpty() || temp.compareTo(max) > 0) {
                    max = temp;
                }
            }
        }

        return max;
    }
}