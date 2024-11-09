class Solution {
    public boolean isBalanced(String num) {
        
        int even = 0;
        int odd = 0;
        
        for(int i = 0;i<num.length();i++){
            if(i % 2 == 0) even += Integer.parseInt(String.valueOf(num.charAt(i)));
            else odd += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        
        return even == odd;
    }
}