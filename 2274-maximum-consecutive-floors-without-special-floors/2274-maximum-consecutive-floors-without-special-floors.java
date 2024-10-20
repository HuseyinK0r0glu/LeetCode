class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        
        Arrays.sort(special);  
        
        int answer = 0;
        
        for(int i = 1;i<special.length;i++){
            answer = Math.max(answer,special[i]-special[i-1]-1);
        }
        
        answer = Math.max(answer, special[0] - bottom);
        answer = Math.max(answer, top - special[special.length-1]);
        return answer;
        
    }
}