class Solution {
    public static String smallestNumber(String pattern) {

        List<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[10];

        backtrack(list,new StringBuilder(),pattern,used);

        for(int val : list){
            if(check(pattern,val)){
                return String.valueOf(val);
            }
        }

        return "";
    }

    public static boolean check(String pattern, int val){
        String num = String.valueOf(val);
        for(int i = 0;i<pattern.length();i++){
            if(pattern.charAt(i) == 'I'){
                if(num.charAt(i) >= num.charAt(i+1)){
                    return false;
                }
            }else if (pattern.charAt(i) == 'D'){
                if(num.charAt(i) <= num.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void backtrack(List<Integer> list, StringBuilder sb,String pattern,boolean[] used) {

        if(sb.length() == pattern.length() + 1) {
            String temp = sb.toString();
            list.add(Integer.parseInt(temp));
            return;
        }

        for(int i = 1; i <=pattern.length()+1; i++) {
            if(used[i]) continue;

            sb.append(i);
            used[i] = true;
            backtrack(list,sb,pattern,used);
            sb.deleteCharAt(sb.length()-1);
            used[i] = false;
        }
    }
}