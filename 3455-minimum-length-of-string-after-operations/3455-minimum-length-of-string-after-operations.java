class Solution {
    public int minimumLength(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;

        for(char key : map.keySet()) {
            if(map.get(key) > 2) {
                int val = map.get(key);
                while(val > 2){
                    val -= 2;
                }
                length += val;
            }else {
                length += map.get(key);
            }
        }

        return length;
    }
}