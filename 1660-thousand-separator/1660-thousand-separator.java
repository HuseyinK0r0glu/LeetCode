class Solution {
    public String thousandSeparator(int n) {

        String value = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        int index = 0;

        for(int i = value.length() - 1; i >= 0; i--) {
            sb.append(value.charAt(i));
            if(index != 0 && (index + 1) % 3 == 0){
                sb.append(".");
            }
            index++;
        }

        sb.reverse();
        if(sb.charAt(0) == '.'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}