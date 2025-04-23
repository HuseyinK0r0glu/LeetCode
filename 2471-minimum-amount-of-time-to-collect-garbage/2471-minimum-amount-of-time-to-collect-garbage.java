import java.util.*;

class Solution {
    public int garbageCollection(String[] garbage , int[] travel) {

        int paperIndex = 0;
        int metalIndex = 0;
        int glassIndex = 0;

        int total = 0;

        for(int i = 0; i < garbage.length; i++){
            String g = garbage[i];
            if(g.contains("P")){
                paperIndex = i;
            }
            if(g.contains("M")){
                metalIndex = i;
            }
            if(g.contains("G")){
                glassIndex = i;
            }
            total += g.length();
        }

        int[] prefix = new int[travel.length + 1];
        prefix[0] = 0;
        for(int i = 1; i < travel.length + 1; i++){
            prefix[i] = prefix[i-1] + travel[i-1];
        }

        total += prefix[glassIndex];
        total += prefix[paperIndex];
        total += prefix[metalIndex];

        return total;

    }
}