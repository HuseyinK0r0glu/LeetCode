class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {

        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        for(char key : map1.keySet()) {
            if(map2.containsKey(key)){
                if(Math.abs(map1.get(key) - map2.get(key)) > 3){
                    return false;
                }
            }else {
                if(map1.get(key) > 3){
                    return false;
                }
            }
        }

        for (char key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                if (map2.get(key) > 3) {
                    return false;
                }
            }
        }

        return true;

    }
}