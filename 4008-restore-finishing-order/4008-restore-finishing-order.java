import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        
        Set<Integer> friendSet = new HashSet<>();
        for(int i : friends) {
            friendSet.add(i);
        }
        
        int index = 0;
        
        for(int i : order) {
            if(friendSet.contains(i)) {
                friends[index++] = i;
            }
        }
        
        return friends;
    }
}