class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        int total = 0;
        Map<String,Integer> map = new HashMap<>();

        for(int[] domino : dominoes) {

            int smaller = Math.min(domino[0], domino[1]);
            int larger = Math.max(domino[0], domino[1]);
            String key = smaller + "-" + larger;

            int count = map.getOrDefault(key, 0);
            total += count;
            map.put(key, count + 1);

        }

        return total;
    }
}