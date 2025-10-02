import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        Map<Character, Integer> map = new HashMap<>();

        int index = 0;
        for(char c : order.toCharArray()){
            map.put(c, index++);
        }

        for(int i = 0; i < words.length-1; i++){
            if(words[i].equals(words[i+1])){
                continue;
            }
            if(!check(words[i], words[i+1], map)){
                return false;
            }
        }

        return true;
    }

    public boolean check(String a , String b , Map<Character, Integer> map){

        int index1 = 0;
        int index2 = 0;

        while(index1 < a.length() && index2 < b.length()){
            if(a.charAt(index1) != b.charAt(index2)){
                int order1 = map.get(a.charAt(index1));
                int order2 = map.get(b.charAt(index2));
                if(order2 < order1){
                    return false;
                }else if(order2 > order1){
                    return true;
                }
            }
            index1++;
            index2++;
        }

        return index2 != b.length() || index1 >= a.length();
    }

}