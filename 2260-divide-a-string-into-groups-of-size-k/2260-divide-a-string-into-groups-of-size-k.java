class Solution {
    public String[] divideString(String s, int k, char fill) {

        String[] res = new String[(s.length() + k - 1) / k];
        int j = 0;

        for(int i = 0;i<res.length;i++){
            if(j + k > s.length()){
                System.out.println("dasd");
                StringBuilder sb = new StringBuilder(s.substring(j));
                sb.append(String.valueOf(fill).repeat(Math.max(0, k-sb.length())));
                res[i] = sb.toString();
            }else {
                res[i] = s.substring(j,j+k);
            }
            j += k;
        }

        return res;
    }
}