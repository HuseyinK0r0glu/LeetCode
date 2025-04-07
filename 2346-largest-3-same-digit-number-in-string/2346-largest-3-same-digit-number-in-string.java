class Solution {
    public String largestGoodInteger(String num) {

        String res = "";
        int max = Integer.MIN_VALUE;
    
        for(int i = 0;i<=num.length()-3;i++) {
            String subStr = num.substring(i, i+3);
            char first = subStr.charAt(0);
            boolean valid = true;
            for(int j = 1;j<subStr.length();j++) {
                if(first != subStr.charAt(j)) {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                int temp = Integer.parseInt(String.valueOf(subStr.charAt(0)));
                if(temp > max) {
                    max = temp;
                    res = subStr;
                }
            }
        }
    
        return res;
    }
}