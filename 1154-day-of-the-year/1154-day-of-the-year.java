class Solution {
    public int dayOfYear(String date) {

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean leapYear = false;

        String[] dateParts = date.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        if(year % 4 == 0){
            if(year % 100 == 0){
                leapYear = (year % 400 == 0);
            }else {
                leapYear = true;
            }
        }

        int days = 0;

        for(int i = 0; i < month-1; i++){
            if(i == 1 && leapYear){
                days++;
            }
            days += daysInMonth[i];
        }

        return days + day;
    }
}