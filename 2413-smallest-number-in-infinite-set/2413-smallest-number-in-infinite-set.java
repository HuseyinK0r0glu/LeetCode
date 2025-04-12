import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

class SmallestInfiniteSet {

    int index = 2;
    PriorityQueue<Integer> pq;
    Set<Integer> set  = new HashSet<>();

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        pq.add(1);
    }

    public int popSmallest() {
        int min = 0;
        if(!pq.isEmpty()) {
            min = pq.poll();
            set.remove(min);
        }
        if(!set.contains(index)) {
            pq.add(index);
            set.add(index);
        }
        index++;
        return min;
    }

    public void addBack(int num) {
        if(num < index-1) {
            if(!set.contains(num)) {
                pq.add(num);
                set.add(num);
            }
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */