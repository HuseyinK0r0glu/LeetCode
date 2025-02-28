import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean halvesAreAlike(String s) {

        Set<Character> set = new HashSet<>();
        for (char ch : new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'}) {
            set.add(ch);
        }

        int count = 0;

        int mid = s.length() / 2;

        for(int i = 0;i<mid;i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        
        for(int i = mid;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count--;
            }
        }
        
        return count == 0;
    }

}