class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);
        
        int moves = 0;
        int seatIndex = 0;
        int studentIndex = 0;
        
        while (seatIndex < seats.length && studentIndex < students.length) {
            int move = Math.abs(seats[seatIndex] - students[studentIndex]);
            moves += move;
            studentIndex++;
            seatIndex++;
        }
        
        return moves;
    }
}