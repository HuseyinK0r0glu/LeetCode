import java.util.*;

class Solution {
    public int numDifferentIntegers(String word) {

        Set<Long> set = new HashSet<>();

        for(int i = word.length()-1;i>=0;i--){
            int pow = 1;
            long num = 0;
            boolean numFound = false;
            while(i>=0 && Character.isDigit(word.charAt(i))){
                numFound = true;
                num += Long.parseLong(String.valueOf(word.charAt(i))) * pow;
                pow *= 10;
                i--;
            }

            if(numFound) set.add(num);

        }

        return set.size();
    }
}