import java.util.HashMap;

class ATM {

    int[] banknotes;
    HashMap<Integer,Integer> map = new HashMap<>();

    public ATM() {
        banknotes = new int[5];
        map.put(0,20);
        map.put(1,50);
        map.put(2,100);
        map.put(3,200);
        map.put(4,500);
    }

    public void deposit(int[] banknotesCount) {

        for(int i=0;i<banknotesCount.length;i++){
            banknotes[i]+=banknotesCount[i];
        }

    }

    public int[] withdraw(int amount) {

        int[] backtrackArray = new int[5];

        int index = 4;

        while(amount > 0 && index >= 0){

            if(banknotes[index]>0){
                int currentBanknote = map.getOrDefault(index,0);
                if(amount >= currentBanknote){
                    int use = Math.min(amount / currentBanknote, banknotes[index]);
                    amount -= currentBanknote * use;
                    banknotes[index] -= use;
                    backtrackArray[index] += use;
                }else {
                    index--;
                }
            }else {
                index--;
            }
        }

        if(amount == 0){
            return backtrackArray;
        }else {
            for(int i=0;i<backtrackArray.length;i++){
                banknotes[i]+=backtrackArray[i];
            }
        }

        return new int[]{-1};
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
