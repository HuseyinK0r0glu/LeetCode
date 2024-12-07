class Solution {
    public int maxRepeating(String sequence, String word) {

        int max = 0;
        String s = word;
        
        while(true){
            if(sequence.contains(s)){
                max++;
                s += word;
            }else {
                break;
            }
        }

        return max;
    }

}