class Solution {
    public int minTimeToType(String word) {

        int time = 0;
        char previous = 'a';
        
        for(char c : word.toCharArray()) {
            int diff = Math.abs(c - previous);
            diff = Math.min(26 - diff , diff);
            time += diff;
            time++;
            previous = c;
        }
        
        return time;
    }
}