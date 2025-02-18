class Solution {
    public String tictactoe(int[][] moves) {

        Character[][] matrix = new Character[3][3];
        String player = "A";

        for(int i = 0;i<matrix.length;i++){
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = '.';
            }
        }

        for(int[] move : moves){
           int row = move[0];
           int col = move[1];

           if(player.equals("A")){
               matrix[row][col] = 'A';
               if(check(matrix,player.charAt(0))){
                   return player;
               }
               player = "B";
           }else {
               matrix[row][col] = 'B';
               if(check(matrix,player.charAt(0))){
                   return player;
               }
               player = "A";
           }
        }
        
        if(moves.length == 9){
            return "Draw";
        }
        
        return "Pending";
    }

    public boolean check(Character[][] matrix,char player){

        for(int i = 0;i<3;i++){
            if((matrix[i][0] == player && matrix[i][1] == player && matrix[i][2] == player) ||
                    (matrix[0][i] == player && matrix[1][i] == player && matrix[2][i] == player)){
                return true;
            }
        }

        if((matrix[0][0] == player && matrix[1][1] == player && matrix[2][2] == player) ||
            matrix[0][2] == player && matrix[1][1] == player && matrix[2][0] == player){
            return true;
        }

        return false;
    }
}