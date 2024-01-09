public class p_2980 {
    public static void main(String[] args) {
        System.out.println(hasTrailingZeros(new int[]{1,2,3,4,5}));
        System.out.println(hasTrailingZeros(new int[]{2,4,8,16}));
        System.out.println(hasTrailingZeros(new int[]{1,3,5,7,9}));
    }

    public static boolean hasTrailingZeros(int[] nums) {
        int zeros = 0;
        for(int i = 0; i < nums.length; i++) {
            if((nums[i] & 1) == 0) {
                zeros++;
                if(zeros >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
