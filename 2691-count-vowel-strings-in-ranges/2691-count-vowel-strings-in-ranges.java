class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int[] prefix = new int[words.length];
        int sum = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            if(set.contains(first) && set.contains(last)) {
                sum++;
            }
            prefix[i] = sum;
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int first = queries[i][0];
            int second = queries[i][1];

            if(first == 0){
                res[i] = prefix[second];
            }else {
                res[i] = prefix[second] - prefix[first-1];
            }
        }

        return res;
    }
}