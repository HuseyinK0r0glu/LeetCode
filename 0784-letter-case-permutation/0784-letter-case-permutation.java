class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> list = new ArrayList<>();
        
        backtrack(s,list,0,new StringBuilder());
        
        return list;
    }
    
    public void backtrack(String s,List<String> list,int index,StringBuilder sb){
        
        if(sb.length() == s.length()){
            String val = sb.toString();
            list.add(val);
        }
        
        for(int i = index;i<s.length();i++){
            char c = s.charAt(i);
            sb.append(c);
            backtrack(s,list,i+1,sb);
            sb.deleteCharAt(sb.length() - 1);
            
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
                else sb.append(Character.toUpperCase(c));
                backtrack(s,list,i+1,sb);
                sb.deleteCharAt(sb.length()-1);
            }
            
        }
        
    }
    
}