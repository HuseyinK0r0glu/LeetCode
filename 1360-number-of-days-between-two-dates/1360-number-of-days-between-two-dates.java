class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(date(date1) - date(date2));
    }

    public int date(String date){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] dateParts = date.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        int days = 0;

        for(int i = 1900;i<year;i++){
            boolean leapYear = false;

            if(i % 4 == 0){
                if(i % 100 == 0){
                    leapYear = (i % 400 == 0);
                }else {
                    leapYear = true;
                }
            }
            if(leapYear){
                days += 366;
            }else{
                days += 365;
            }
        }

        boolean leapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                leapYear = (year % 400 == 0);
            }else {
                leapYear = true;
            }
        }

        for(int i = 0; i < month-1; i++){
            if(i == 1 && leapYear){
                days++;
            }
            days += daysInMonth[i];
        }
        return days + day;
    }
}