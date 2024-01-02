public class p_0747 {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{3,6,1,0}));
        System.out.println(dominantIndex(new int[]{1,2,3,4}));
        System.out.println(dominantIndex(new int[]{1,2,3,7}));
        System.out.println(dominantIndex(new int[]{1,0}));
        System.out.println(dominantIndex(new int[]{0,0,3,2}));
    }

    public static int dominantIndex(int[] nums) {
        int maxA, maxB;
        maxA = (nums[0] > nums[1]) ? 0 : 1;
        maxB = (maxA == 0) ? 1 : 0;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] > nums[maxA]) {
                maxB = maxA;
                maxA = i;
            } else if(nums[i] > nums[maxB]) {
                maxB = i;
            }
        }
        return (nums[maxA] >= (nums[maxB] * 2)) ? maxA : -1;
    }
}