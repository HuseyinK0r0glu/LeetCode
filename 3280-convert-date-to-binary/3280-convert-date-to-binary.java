class Solution {
    public static String convertDateToBinary(String date) {

        String res = "";
        long year = getBinary(Integer.parseInt(date.substring(0, 4)));
        long month = getBinary(Integer.parseInt(date.substring(5, 7)));
        long day = getBinary(Integer.parseInt(date.substring(8, 10)));

        res = year + "-" + month + "-" + day;

        return res;
    }

    public static long getBinary(long num){

        if(num == 0) return 0;

        return (num % 2) + 10*getBinary(num/2);
    }
}