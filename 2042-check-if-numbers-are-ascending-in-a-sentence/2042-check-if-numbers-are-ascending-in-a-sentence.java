class Solution {
    public static boolean areNumbersAscending(String s) {

        String[] words = s.split(" ");
        int previous = -1;
        for(String word : words) {

            if(Character.isDigit(word.charAt(0))){
                int value = Integer.parseInt(word);
                if(value <= previous){
                    return false;
                }else {
                    previous = value;
                }
            }

        }

        return true;
    }
}