public class P55_jumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,3,1,1,4}));
        System.out.println(canJump(new int[]{5,1}));
        System.out.println(canJump(new int[]{0,3}));
        System.out.println(canJump(new int[]{3,0,0,1,3}));
        System.out.println(canJump(new int[]{3,0,0,0,2,1}));
    }

    public static boolean canJump(int[] nums) {
        return canJump(nums, 0);
    }

    public static boolean canJump(int[] nums, int index) {
        if(index >= (nums.length - 1)) {
            return true;
        }
        for(int i = nums[index]; i > 0; i--) {
            if(canJump(nums, index + i)) {
                return true;
            }
        }
        return false;
    }
}
