class Solution {
    public int countGoodSubstrings(String s) {

        int count = 0;
    
        for(int i = 0;i<=s.length()-3;i++) {
            Set<Character> set = new HashSet<>();
            String sub = s.substring(i,i+3);
            boolean valid = true;
            for(char c : sub.toCharArray()) {
                if(set.contains(c)) {
                    valid = false;
                }
                set.add(c);
            }
            if(valid) {
                count++;
            }
        }
        return count;
    }
}