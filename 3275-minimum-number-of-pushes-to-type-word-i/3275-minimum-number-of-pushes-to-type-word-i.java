import java.util.*;

class Solution {
    public int minimumPushes(String word) {

        Map<Character, Integer> map = new HashMap<>();

        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for(char c : map.keySet()){
            list.add(map.get(c));
        }

        Collections.sort(list);

        int k = 0;
        int totalCost = 0;
        int unitCost = 1;
        
        for(int i = list.size() - 1; i >= 0; i--){
            totalCost += list.get(i) *  unitCost;
            k++;
            if(k == 8){
                k = 0;
                unitCost++;
            }
        }

        return totalCost;
    }
}