class Solution {
    public int hardestWorker(int n, int[][] logs) {

        int employee = 0;
        int maxHour = 0;

        for(int i = 0; i < logs.length; i++) {
            int worker = logs[i][0];
            int hour = logs[i][1];

            if(i == 0){
                if(hour > maxHour || (hour == maxHour && worker < employee)){
                    maxHour = hour;
                    employee = worker;
                }
            }else {
                if(hour - logs[i-1][1] > maxHour || (hour - logs[i-1][1] == maxHour && worker < employee)){
                    maxHour = hour - logs[i-1][1];
                    employee = worker;
                }
            }
        }
        return employee;
    }

}