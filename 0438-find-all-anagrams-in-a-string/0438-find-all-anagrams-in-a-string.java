class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list = new ArrayList<>();
        
        char[] chars1 = p.toCharArray();
        Arrays.sort(chars1);
        p = new String(chars1);
        
        for(int i = 0;i<s.length()-p.length()+1;i++){
            
            String temp = s.substring(i,i+p.length());
            
            char[] chars2 = temp.toCharArray();
        
            Arrays.sort(chars2);
            
            if(new String(chars2).equals(p)) list.add(i);
            
        }
        
        return list;
    }
}