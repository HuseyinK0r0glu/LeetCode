import java.util.*;

class Solution {
    public int numPrimeArrangements(int n) {

        int count = 0;

        for(int i = 2;i<=n;i++){
            if(prime(i)){
                count++;
            }
        }

        int mod = 1000000007;

        long result = 1;

        for(int i = 1;i<=count;i++){
            result = (result * i) % mod;
        }

        for(int i = 1;i<=n-count;i++){
            result = (result * i) % mod;
        }

        return (int) ( result % mod);
    }


    public boolean prime(int n) {

        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}