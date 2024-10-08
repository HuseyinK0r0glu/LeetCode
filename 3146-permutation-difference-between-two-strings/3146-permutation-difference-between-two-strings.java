class Solution {
    public int findPermutationDifference(String s, String t) {
        
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            mapS.put(s.charAt(i),i);
        } 
        
        for(int i = 0;i<t.length();i++){
            mapT.put(t.charAt(i),i);
        } 
        
        int sum = 0;
        
        for(char key : mapS.keySet()){
            sum += Math.abs(mapS.get(key) - mapT.get(key));
        }
        
        return sum;
    }
}