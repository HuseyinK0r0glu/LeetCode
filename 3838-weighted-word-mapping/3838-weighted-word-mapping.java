class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            int weight = 0;
            for (char c : word.toCharArray()) {
                weight += weights[c - 'a'];
            }
            
            weight = weight % 26; 
            char Z = (char) (26 - weight + 'a' - 1);
            sb.append(Z);
        }

        return sb.toString();
    }
}