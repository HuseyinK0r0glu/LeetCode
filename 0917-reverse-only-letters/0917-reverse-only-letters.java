class Solution {
    public static String reverseOnlyLetters(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while(left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }

            while(left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }

            if(left < right) {
                char[] arr = s.toCharArray();
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                s = String.valueOf(arr);
            }

            left++;
            right--;

        }
        return s;

    }
}