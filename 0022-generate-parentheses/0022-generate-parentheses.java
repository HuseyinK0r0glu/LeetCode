class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<>();
        
        backtrack(new StringBuilder(),list,n,0,0);
        
        return list;
    }
    
    public void backtrack(StringBuilder sb,List<String> list,int n,int open,int close){
        
        if(sb.length() == 2 * n){
            list.add(sb.toString());
            return;
        }
        
        if(open < n){
            sb.append("(");
            backtrack(sb,list,n,open+1,close);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(close < open){
            sb.append(")");
            backtrack(sb,list,n,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}