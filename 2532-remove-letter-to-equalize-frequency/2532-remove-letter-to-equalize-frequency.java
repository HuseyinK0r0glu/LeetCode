import java.util.*;

class Solution {
    public boolean equalFrequency(String word) {

        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        if(charMap.size() == 1) return true;

        Map<Integer, Integer> freqMap = new HashMap<>();

        int count1 = 0;
        int count2 = 0;
        int freq1 = 0;
        int freq2 = 0;
        boolean flag = true;

        for(char c : charMap.keySet()) {
            freqMap.put(charMap.get(c), freqMap.getOrDefault(charMap.get(c), 0) + 1);
            if(freqMap.size() > 2){
                return false;
            }
        }

        if(freqMap.size() == 1){
            for(int i : freqMap.keySet()){
                if(i == 1){
                    return true;
                }
            }
        }

        if(freqMap.size() != 2){
            return false;
        }


        for(int i : freqMap.keySet()){
            if(flag){
                count1 = i;
                freq1 = freqMap.get(i);
                flag = false;
            }else {
                count2 = i;
                freq2 = freqMap.get(i);
            }
        }

        if ((freq1 == 1 && count1 == 1) || (freq2 == 1 && count2 == 1)) {
            return true;
        }
        if ((Math.abs(count1 - count2) == 1) && ((freq1 == 1 && count1 > count2) || (freq2 == 1 && count2 > count1))) {
            return true;
        }
        return false;
    }
}