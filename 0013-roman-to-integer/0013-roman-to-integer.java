class Solution {
    public int romanToInt(String s) {
        int total = 0;
        for(int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == 'I') {
                if(i < s.length() -1 && s.charAt(i+1) == 'V'){
                    i++;
                    total = total + 4;
                }else if(i < s.length() -1 && s.charAt(i+1) == 'X'){
                    i++;
                    total = total + 9;
                }else {
                    total = total + 1;
                }
                
            } else if (s.charAt(i) == 'V') {
                total = total + 5;
            } else if (s.charAt(i) == 'X') {
                if(i < s.length() -1 && s.charAt(i+1) == 'L'){
                    i++;
                    total = total + 40;
                }else if(i < s.length() -1 && s.charAt(i+1) == 'C'){
                    i++;
                    total = total + 90;
                }else {
                total = total + 10;
                }
            } else if (s.charAt(i) == 'L') {
                total = total + 50;
            } else if (s.charAt(i) == 'C') {
                if(i < s.length() -1 && s.charAt(i+1) == 'D'){
                    i++;
                    total = total + 400;
                }else if(i < s.length() -1 && s.charAt(i+1) == 'M'){
                    i++;
                    total = total + 900;
                }else {
                    total = total + 100;
                }
            } else if (s.charAt(i) == 'D') {
                total = total + 500;
            } else if (s.charAt(i) == 'M') {
                total = total + 1000;
            }
        }
        return total;
    }
}
