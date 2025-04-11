class Solution {
    public String oddString(String[] words){

        int n = words[0].length();

        for(int i = 0;i<n-1;i++){
            Map<Integer,List<Integer>> map = new HashMap<>();
            for(int j = 0;j<words.length;j++){
                String word = words[j];
                int diff = (word.charAt(i+1) - 'a') - (word.charAt(i) - 'a');
                map.computeIfAbsent(diff, k -> new ArrayList<>()).add(j);
            }
            
            for(int key : map.keySet()){
                if(map.get(key).size() == 1){
                    return words[map.get(key).get(0)];
                }
            }
            
        }
        return "";
    }
}