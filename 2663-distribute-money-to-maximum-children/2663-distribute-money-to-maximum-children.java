class Solution {
    public int distMoney(int money, int children) {

        if(children > money) {
            return -1;
        }

        money -= children;

        int res = Math.min(money/7, children);

        money -= res * 7;

        int remaining = children - res;

        if(remaining == 1 && money == 3){
            res--;
        }

        if(money > 0 && remaining == 0){
            res--;
        }

        return res;
    }
}