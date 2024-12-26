class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int arriveAliceDays = days(arriveAlice);
        int leaveAliceDays = days(leaveAlice);
        int arriveBobDays = days(arriveBob);
        int leaveBobDays = days(leaveBob);

        int starting = Math.max(arriveAliceDays,arriveBobDays);
        int ending = Math.min(leaveAliceDays,leaveBobDays);

        if(starting > ending) {
            return 0;
        }
        
        return ending - starting + 1;
        
    }

    public int days(String date){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;
        String[] temp = date.split("-");
        int month = Integer.parseInt(temp[0]);
        int day = Integer.parseInt(temp[1]);

        for(int i = 0;i<month-1;i++){
            days += daysInMonth[i];
        }

        return days + day;
    }
}