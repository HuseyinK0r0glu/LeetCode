class Solution {
    public String winningPlayer(int x, int y) {

        String player = "Alice";
        String winner = "";
        
        while(true) {
            if(x >= 1 && y >= 4){
                x--;
                y-=4;
                if(player.equals("Alice")){
                    player = "Bob";
                }else {
                    player = "Alice";
                }
            }else {
                if(player.equals("Alice")){
                    winner = "Bob";
                    break;
                }else {
                    winner = "Alice";
                    break;
                }
            }
        }

        return winner;
    }

}