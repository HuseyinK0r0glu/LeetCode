class Solution {
    public int countPoints(String rings) {

        Map<Character,Set<Character>> map = new HashMap<>();
        int total = 0;

        for(int i = 0;i<rings.length();i = i+2){
            char current = rings.charAt(i+1);
            char color = rings.charAt(i);
            if(map.containsKey(current)){
                map.get(current).add(color);
            }else {
                Set<Character> set = new HashSet<>();
                set.add(color);
                map.put(current,set);
            }
        }

        for(char key : map.keySet()){
            if(map.get(key).size() == 3){
                total++;
            }
        }
        return total;
    }

}