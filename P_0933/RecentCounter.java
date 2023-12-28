import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private int[] ranges;
    private Queue<Integer> calls;

    public RecentCounter() {
        ranges = new int[]{-3000, 0};
        calls = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        ranges[0] = t - 3000;
        ranges[1] = t;
        calls.add(t);
        while(calls.peek() < ranges[0]) {
            calls.remove();
        }
        return calls.size();
    }
}
