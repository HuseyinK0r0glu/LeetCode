class Solution {
    public int minDeletionSize(String[] strs) {

        int index = 0;
        int totalMove = 0;

        while(index < strs[0].length()){
            for(int i = 0;i<strs.length-1;i++){
                if(strs[i].charAt(index) > strs[i+1].charAt(index)){
                    totalMove++;
                    break;
                }
            }
            index++;
        }

        return totalMove;
    }
}