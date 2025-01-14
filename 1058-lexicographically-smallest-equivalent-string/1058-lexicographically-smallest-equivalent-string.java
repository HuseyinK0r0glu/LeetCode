class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {

        Map<Character, Set<Character>> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            map.putIfAbsent(c1, new HashSet<>());
            map.putIfAbsent(c2, new HashSet<>());

            map.get(c1).add(c2);
            map.get(c2).add(c1);
        }

        StringBuilder sb = new StringBuilder();

        for(char c : baseStr.toCharArray()) {

            if(map.containsKey(c)) {
                sb.append(findMin(c,map));
            }else {
                sb.append(c);
            }

        }

        return sb.toString();
    }

    private char findMin(char c, Map<Character, Set<Character>> map) {

        PriorityQueue<Character> pq = new PriorityQueue<>();
        Set<Character> set = new HashSet<>();
        Queue<Character> q = new LinkedList<>();
        q.add(c);
        set.add(c);

        while(!q.isEmpty()) {
            char current = q.poll();
            pq.add(current);
            if(map.containsKey(current)) {
                for(char c2 : map.get(current)) {
                    if(!set.contains(c2)) {
                        q.add(c2);
                        set.add(c2);
                    }
                }
            }

        }

        return pq.peek();
    }
}