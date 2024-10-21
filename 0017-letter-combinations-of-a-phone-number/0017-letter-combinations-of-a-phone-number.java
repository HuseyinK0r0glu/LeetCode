class Solution {
    public List<String> letterCombinations(String digits) {
        
        Map<Integer,String> map = new HashMap<>();
        
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        
        List<String> list = new ArrayList<>();
        
        if(digits.length() == 0) return list; 
        
        backTrack(list,new StringBuilder(),digits,map,0);
        
        return list; 
    }
    
    public void backTrack(List<String> list,StringBuilder sb,String digits,Map<Integer,String> map,int index){
        
        if(index == digits.length()) {
            list.add(sb.toString());
            return;
        }
        
        String letters = map.get(Integer.parseInt(String.valueOf(digits.charAt(index))));
        
        for(int i = 0;i<letters.length();i++){
            sb.append(letters.charAt(i));
            backTrack(list,sb,digits,map,index+1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
}