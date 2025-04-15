class Solution {
    public int isWinner(int[] player1, int[] player2) {

        int score1 = 0;
        int score2 = 0;

        for(int i = 0; i < player1.length; i++) {
            int current1 = player1[i];
            
            boolean found1 = false;
            
            if(i > 0){
                if(player1[i-1] == 10){
                    score1 += current1 * 2;
                    found1 = true;
                }
            }
            
            if(i > 1 && !found1){
                if(player1[i-2] == 10){
                    score1 += current1 * 2;
                    found1 = true;
                }
            }
            
            if(!found1){
                score1 += current1;
            }
            
            int current2 = player2[i];

            boolean found2 = false;
            
            if(i > 0){
                if(player2[i-1] == 10){
                    score2 += current2 * 2;
                    found2 = true;
                }
            }
            if(i > 1 && !found2){
                if(player2[i-2] == 10){
                    score2 += current2 * 2;
                    found2 = true;
                }
            }
            
            if(!found2){
                score2 += current2;
            }
            
        }

        return (score1 > score2) ? 1 : (score1 == score2) ? 0 : 2;
    }
}