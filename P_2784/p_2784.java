import java.util.ArrayList;

public class p_2784 {
    public static void main(String[] args) {
        System.out.println(isGood(new int[]{2, 1, 4, 4, 3}));
    }

    public static boolean isGood(int[] nums) {
        ArrayList<Integer> base = new ArrayList<>();
        for(int i = 0; i < (nums.length - 1); i++) {
            base.add(i + 1);
        }
        base.add(nums.length - 1);

        for(int x : nums) {
            if(!base.contains(x)) {
                return false;
            }
            base.remove(Integer.valueOf(x));
        }

        return true;
    }
}