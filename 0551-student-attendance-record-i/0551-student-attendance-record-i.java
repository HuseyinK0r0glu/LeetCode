class Solution {
    public boolean checkRecord(String s) {

        int absentCount = 0;
        int lateCount = 0;

        for(int i = 0;i<s.length();i++){

            if(s.charAt(i) == 'P'){
                lateCount = 0;
                continue;
            }else if(s.charAt(i) == 'A'){
                lateCount = 0;
                absentCount++;
                if(absentCount > 1){
                    return false;
                }
            }else {
                lateCount++;
                if(lateCount > 2){
                    return false;
                }
            }
        }

        return true;

    }
}