class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {

        Arrays.sort(players);
        Arrays.sort(trainers);

        int total = 0;

        int playerIndex = 0;
        int trainerIndex = 0;

        while(playerIndex < players.length && trainerIndex < trainers.length) {
            if(players[playerIndex] <= trainers[trainerIndex]) {
                total++;
                playerIndex++;
                trainerIndex++;
            }else{
                trainerIndex++;
            }
        }
        return total;
    }
}