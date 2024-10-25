class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        s = new String(chars1);
        t = new String(chars2);
        
        return s.equals(t);
        
    }
}