class Solution {
    public static int maxNumberOfBalloons(String text) {

        Map<Character,Integer> map = new HashMap<>();

        for(char c : text.toCharArray()) {
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        int min = Integer.MAX_VALUE;

        String balloon = "balloon";

        for(char c : balloon.toCharArray()) {
            if(c == 'l' || c == 'o') {
                min = Math.min(min,map.getOrDefault(c,0)/2);
            }
            min = Math.min(min,map.getOrDefault(c,0));
        }

        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}