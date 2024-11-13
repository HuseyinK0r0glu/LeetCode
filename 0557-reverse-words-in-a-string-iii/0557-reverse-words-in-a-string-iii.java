class Solution {
    public static String reverseWords(String s) {

        String[] arr = s.split(" ");

        StringBuilder res = new StringBuilder();

        for(int i = 0;i < arr.length;i++){

            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for(int j = 0;j<arr[i].length();j++){
                stack.push(arr[i].charAt(j));
            }

            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }

            res.append(sb.toString());
            if(i < arr.length-1){
                res.append(" ");
            }
        }

        return res.toString();
    }

}