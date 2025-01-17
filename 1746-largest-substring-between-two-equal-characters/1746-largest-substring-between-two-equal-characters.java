class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {

        Map<Character, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(!map.containsKey(c)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(c, list);
            }else {
                map.get(c).add(i);
            }
        }
        
        int max = 0;

        for(char c : map.keySet()) {
            List<Integer> list = map.get(c);
            int localMin = Integer.MAX_VALUE;
            int localMax = Integer.MIN_VALUE;

            for(Integer i : list) {
                localMin = Math.min(localMin, i);
                localMax = Math.max(localMax, i);
            }

            max = Math.max(max, localMax - localMin);
        }
        return max - 1;
    }
}