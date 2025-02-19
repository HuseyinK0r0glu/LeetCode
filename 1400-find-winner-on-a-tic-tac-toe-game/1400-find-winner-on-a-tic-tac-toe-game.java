class Solution {
    public String tictactoe(int[][] moves) {

        Character[][] board = new Character[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '.';
            }
        }

        String player = "A";

        for(int[] move : moves) {
            int row = move[0];
            int col = move[1];

            if(player.equals("A")) {
                board[row][col] = 'A';
                if(checkWin(board,'A')){
                    return player;
                }
                player = "B";
            }else {
                board[row][col] = 'B';
                if(checkWin(board,'B')){
                    return player;
                }
                player = "A";
            }
        }

        if(moves.length == 9) return "Draw";

        return "Pending";
    }

    public boolean checkWin(Character[][] board,char player) {

        if((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }

        for(int i = 0;i<3;i++){
            if((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)){
                return true;
            }
        }

        return false;
    }

}