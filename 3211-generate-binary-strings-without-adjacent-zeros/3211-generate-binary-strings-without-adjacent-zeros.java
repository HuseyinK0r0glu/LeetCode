class Solution {
    public static List<String> validStrings(int n) {

        List<String> list = new ArrayList<>();

        backtrack(list,n,new StringBuilder());

        return list;

    }

    public static void backtrack(List<String> list,int n, StringBuilder sb){

        if(sb.length() == n){
            String temp = sb.toString();
            list.add(temp);
            return;
        }

        if(sb.isEmpty()){
            sb.append("1");
            backtrack(list,n,sb);
            sb.deleteCharAt(sb.length()-1);
            sb.append("0");
            backtrack(list,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }else if(sb.charAt(sb.length()-1)=='0'){
            sb.append("1");
            backtrack(list,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }else {
            sb.append("1");
            backtrack(list,n,sb);
            sb.deleteCharAt(sb.length()-1);
            sb.append("0");
            backtrack(list,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}