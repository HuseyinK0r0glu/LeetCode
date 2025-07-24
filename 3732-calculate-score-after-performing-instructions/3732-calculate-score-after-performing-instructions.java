import java.util.*;

class Solution {
    public long calculateScore(String[] instructions, int[] values) {

        int index = 0;
        long score = 0;

        Set<Integer> visited = new HashSet<>();

        while(index >= 0 && index < instructions.length) {
            if(visited.contains(index)) {
                return score;
            }
            visited.add(index);
            
            if(instructions[index].equals("add")){
                score +=  values[index];
                index++;
            }else {
                int jump = values[index];
                if(jump + index == index){
                    return score;
                }
                index = index + jump;
            }
        }
        return score;
    }
}