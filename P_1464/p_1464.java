import java.util.Collections;
import java.util.PriorityQueue;

public class p_1464 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
        System.out.println(maxProduct(new int[]{1,5,4,5}));
        System.out.println(maxProduct(new int[]{3,7}));
    }

    public static int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums) {
            pq.add(num);
        }
        return ((pq.poll() - 1) * (pq.poll() - 1));
    }
}
