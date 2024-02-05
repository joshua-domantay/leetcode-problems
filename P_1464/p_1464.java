import java.util.Collections;
import java.util.PriorityQueue;

public class p_1464 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
        System.out.println(maxProduct(new int[]{1,5,4,5}));
        System.out.println(maxProduct(new int[]{3,7}));
    }

    public static int maxProduct(int[] nums) {
        int a = 0, b = 0;
        for(int num : nums) {
            if(num >= a) {
                b = a;
                a = num;
            } else if(num > b) {
                b = num;
            }
        }
        return (a-1) * (b-1);
    }
}
