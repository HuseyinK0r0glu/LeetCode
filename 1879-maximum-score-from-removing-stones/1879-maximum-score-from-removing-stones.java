import java.util.*;

class Solution {
    public int maximumScore(int a, int b, int c) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        pq.add(a);
        pq.add(b);
        pq.add(c);

        int score = 0;

        while(!pq.isEmpty()) {
            int max = pq.poll();
            int secondMax = pq.poll();
            if(max == 0 || secondMax == 0) {
                break;
            }
            max--;
            secondMax--;
            pq.add(secondMax);
            pq.add(max);
            score++;
        }
        
        return score;
    }
}