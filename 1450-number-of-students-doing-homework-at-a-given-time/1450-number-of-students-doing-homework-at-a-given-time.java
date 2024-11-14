class Solution {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int students = 0;

        for(int i = 0;i<startTime.length;i++) {

            if(startTime[i] <= queryTime && endTime[i] >= queryTime) {
                students++;
            }

        }

        return students;
    }

}