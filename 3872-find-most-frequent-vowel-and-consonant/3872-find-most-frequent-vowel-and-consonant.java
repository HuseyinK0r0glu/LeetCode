class Solution {
    public int maxFreqSum(String s) {

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int vowelMax = 0;
        int consonantMax = 0;
        for (char c : map.keySet()) {
            if(set.contains(c)) {
                vowelMax = Math.max(vowelMax, map.get(c));
            }else {
                consonantMax = Math.max(consonantMax, map.get(c));
            }
        }

        return vowelMax + consonantMax;
    }
}