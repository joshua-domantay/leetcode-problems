public class p_2733 {
    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[]{3,2,1,4}));
        System.out.println(findNonMinOrMax(new int[]{1,2}));
        System.out.println(findNonMinOrMax(new int[]{2,1,3}));
        System.out.println(findNonMinOrMax(new int[]{1,2,3}));
        System.out.println(findNonMinOrMax(new int[]{3,2,1}));
        System.out.println(findNonMinOrMax(new int[]{3,1,2}));
    }

    public static int findNonMinOrMax(int[] nums) {
        if(nums.length < 3) { return -1; }

        return (nums[0] + nums[1] + nums[2]) - Math.min(Math.min(nums[0], nums[1]), nums[2]) - Math.max(Math.max(nums[0], nums[1]), nums[2]);


        // int min1 = Math.min(nums[0], nums[1]);
        // int min2 = Math.min(nums[1], nums[2]);
        // if(min1 == min2) {
        //     return Math.min(nums[0], nums[2]);
        // } else {
        //     return Math.max(min1, min2);
        // }


        // int min = 0, max = 0, between = 0;
        // for(int i = 0; i < 3; i++) {
        //     between = i;
        //     if(nums[i] < nums[min]) {
        //         between = min;
        //         min = i;
        //     } else if (nums[max] < nums[i]) {
        //         between = max;
        //         max = i;
        //     }
        // }
        // return nums[between];
    }
}
