class Solution {
    public static String digitSum(String s, int k) {

        while(s.length() > k){

            StringBuilder sb = new StringBuilder();

            int sum = 0;
            int kth = 0;
            for(char c : s.toCharArray()){
                sum += c - '0';
                kth++;
                if(kth == k){
                    sb.append(sum);
                    kth = 0;
                    sum = 0;
                }
            }

            if(kth != 0) sb.append(sum);

            s = sb.toString();
        }

        return s;
    }
}