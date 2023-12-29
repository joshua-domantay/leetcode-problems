public class p_0881 {
    public static void main(String[] args) {
        System.out.println(numRescueBoats(new int[]{1,2}, 3));
        System.out.println(numRescueBoats(new int[]{3,2,2,1}, 3));
        System.out.println(numRescueBoats(new int[]{3,5,3,4}, 5));
        System.out.println(numRescueBoats(new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 5));
        System.out.println(numRescueBoats(new int[]{1, 2, 2, 2, 2, 3, 3}, 5));
        System.out.println(numRescueBoats(new int[]{3,1,7}, 7));
    }

    public static int numRescueBoats(int[] people, int limit) {
        int[] nums = new int[limit + 1];
        for(int i = 0; i < people.length; i++) {
            nums[people[i]]++;
        }

        int boats = 0;
        for(int i = (nums.length - 1); i > 0; i--) {
            for(int j = (limit - i); j > 0; j--) {
                if(nums[i] <= 0) {
                    break;
                }
                while((nums[i] > 0) && (nums[j] > 0)) {
                    if(i == j) {    // If same number, check if nums has 2 numbers to deduct
                        if(nums[i] < 2) {
                            break;
                        }
                    }
                    nums[i]--;
                    nums[j]--;
                    boats++;
                }
            }
            while(nums[i] > 0) {
                nums[i]--;
                boats++;
            }
        }

        return boats;
    }
}
