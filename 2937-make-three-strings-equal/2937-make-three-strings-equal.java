class Solution {
    public static int findMinimumOperations(String s1, String s2, String s3) {

        int mostPrefix = 0;

        int minLength = Math.min(s1.length(),Math.min(s2.length(),s3.length()));

        for(int i = 0;i<minLength;i++) {

            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
                mostPrefix++;
            }else {
                break;
            }
        }
        
        if(mostPrefix == 0) return -1;
        return s1.length() + s2.length() + s3.length() - mostPrefix * 3;
    }
}