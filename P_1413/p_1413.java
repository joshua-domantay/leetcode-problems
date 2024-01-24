public class p_1413 {
    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3,2,-3,4,2}));
        System.out.println(minStartValue(new int[]{1,2}));
        System.out.println(minStartValue(new int[]{1,-2,-3}));
    }

    public static int minStartValue(int[] nums) {
        /* 0ms */
        int val = 1, startVal;
        if(nums[0] < 0) {
            val = (nums[0] * -1) + 1;
        }
        startVal = val;

        for(int num : nums) {
            startVal = startVal + num;
            if(startVal < 1) {
                val += (startVal * -1) + 1;
                startVal = 1;
            }
        }

        return val;

        /* 2ms */
        // int val = 1, startVal;
        // while(true) {
        //     startVal = val;
        //     for(int num : nums) {
        //         startVal = startVal + num;
        //         if(startVal < 1) { break; }
        //     }
        //     if(startVal >= 1) { break; }
        //     startVal = ++val;
        // }
        // return val;
    }
}
