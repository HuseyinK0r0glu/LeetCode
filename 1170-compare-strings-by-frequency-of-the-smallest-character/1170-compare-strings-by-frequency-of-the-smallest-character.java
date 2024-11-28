class Solution {
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {

        int[] wordFrequencies = new int[words.length];

        for(int i = 0;i<words.length;i++) {
            String word = words[i];
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            int freq = 0;
            char current = chars[0];
            for(char c : chars) {
                if(c == current) freq++;
                else break;
            }
            wordFrequencies[i] = freq;
        }

        Arrays.sort(wordFrequencies);

        int[] res = new int[queries.length];

        for(int i = 0;i<queries.length;i++) {
            String query = queries[i];
            char[] chars = query.toCharArray();
            Arrays.sort(chars);
            int freq = 0;
            char current = chars[0];
            for(char c : chars) {
                if(c == current) freq++;
                else break;
            }

            int count = 0;

            for(int wordFreq : wordFrequencies) {
                if(freq < wordFreq) {
                    count++;
                }
            }

            res[i] = count;
        }
        return res;
    }
}