class Solution {
    public int findSpecialInteger(int[] arr) {

        int occurence = 0;
        int res = -1;

        for(int i : arr){
            if(i == res){
                occurence++;
                if(occurence > arr.length / 4){
                    return res;
                }
            }else {
                res = i;
                occurence = 1;
            }
        }
        return res;
    }
}