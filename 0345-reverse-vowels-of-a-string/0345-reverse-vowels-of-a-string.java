class Solution {
    public static String reverseVowels(String s) {

        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {

            while(start < end && !vowels.contains(String.valueOf(chars[start]))) {
                start++;
            }

            while(start < end && !vowels.contains(String.valueOf(chars[end]))) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);

    }
}