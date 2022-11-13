public class P283_moveZeroes {
    public static void main(String[] args) {
        int[] n = new int[]{0, 1, 0, 3, 12};
        printN(n);
        moveZeroes(n);
        printN(n);
        n = new int[]{0, 1, 0, 0, 12, 3, 0, 4};
        printN(n);
        moveZeroes(n);
        printN(n);
    }

    public static void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void printN(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
