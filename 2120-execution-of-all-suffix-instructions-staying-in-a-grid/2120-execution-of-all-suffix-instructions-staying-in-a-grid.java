class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {

        int[] res = new int[s.length()];

        for(int k = 0; k < s.length(); k++){
            int count = 0;
            int startRow = startPos[0];
            int startCol = startPos[1];
            for(int j = k;j<s.length();j++){

                if(s.charAt(j) == 'R'){
                    startCol++;
                }else if(s.charAt(j) == 'L'){
                    startCol--;
                }else if(s.charAt(j) == 'U'){
                    startRow--;
                }else {
                    startRow++;
                }
                if(startRow >= 0 && startCol >= 0 && startRow < n && startCol < n){
                    count++;
                }else {
                    break;
                }
            }
            res[k] = count;
        }
        return res;
    }
}