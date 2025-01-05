class Solution {
    public String shiftingLetters(String s, int[][] shifts) {

        int n = s.length();
        int[] diff = new int[n+1];

        for(int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            if(direction == 1) {
                diff[start] += 1;
                if(end + 1 < diff.length) {
                    diff[end + 1] -= 1;
                }
            }else {
                diff[start] -= 1;
                if(end + 1 < diff.length) {
                    diff[end + 1] += 1;
                }
            }
        }

        int[] prefix = new int[n];
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += diff[i];
            prefix[i] = sum;
        }


        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            char current = s.charAt(i);
            int newValue = (current - 'a' + prefix[i]) % 26;
            if(newValue < 0){
                newValue += 26;
            }
            char newChar = (char) ('a' + newValue);
            sb.append(newChar);
        }

        return sb.toString();
    }
}