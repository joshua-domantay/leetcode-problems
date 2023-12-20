import java.util.HashMap;

public class p_0961 {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    // Using HashSet may improve memory usage according to better user submissions
    public static int repeatedNTimes(int[] nums) {
        HashMap m = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])) {
                return nums[i];
            } else {
                m.put(nums[i], 1);
            }
        }
        return -1;
    }
}
