import java.util.Arrays;

public class p_0977 {
    public static void main(String[] args) {
        int[] result = sortedSquares(new int[]{-4,-1,0,3,10});
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " > ");
        }
        System.out.println();
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
