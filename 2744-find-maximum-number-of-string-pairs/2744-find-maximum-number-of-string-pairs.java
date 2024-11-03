class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        
        int pairs = 0;
        
        for(int i = 0;i<words.length;i++){
            for(int j = i+1;j<words.length;j++){
                String reversed = new StringBuilder(words[i]).reverse().toString();
                if(reversed.equals(words[j])) pairs++;
            }
        }
        
        return pairs;
    }
}