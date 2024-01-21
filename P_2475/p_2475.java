public class p_2475 {
    public static void main(String[] args) {
        System.out.println(unequalTriplets(new int[]{4,4,2,4,3}));
        System.out.println(unequalTriplets(new int[]{1,1,1,1,1}));
    }

    public static int unequalTriplets(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] != nums[j]) {
                    for(int k = j + 1; k < nums.length; k++) {
                        if((nums[i] != nums[k]) && (nums[j] != nums[k])) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
