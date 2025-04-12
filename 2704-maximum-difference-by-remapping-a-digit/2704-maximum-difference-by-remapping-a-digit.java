import java.util.*;

class Solution {
    public int minMaxDifference(int num) {

        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        char change = ' ';

        for(char c : s.toCharArray()) {
            if(c == '9'){
                sb.append(9);
            } else if(first) {
                sb.append(9);
                change = c;
                first = false;
            }else if(c == change) {
                sb.append(9);
            }
            else {
                sb.append(c);
            }
        }

        int max = Integer.parseInt(sb.toString());
        sb.delete(0,sb.length());
        first = true;
        change = ' ';

        for(char c : s.toCharArray()) {
            if(c == '0'){
                sb.append(0);
            }else if(first) {
                sb.append(0);
                change = c;
                first = false;
            }else if(c == change) {
                sb.append(0);
            }
            else {
                sb.append(c);
            }
        }

        return max - Integer.parseInt(sb.toString());
    }
}