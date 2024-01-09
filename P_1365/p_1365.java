public class p_1365 {
    public static void main(String[] args) {
        int[] test = smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
        printArr(test);
        test = smallerNumbersThanCurrent(new int[]{6,5,4,8});
        printArr(test);
        test = smallerNumbersThanCurrent(new int[]{7,7,7,7});
        printArr(test);
    }

    public static void printArr(int[] test) {
        for(int i = 0; i < (test.length - 1); i++) {
            System.out.print(test[i] + ", ");
        }
        System.out.println(test[test.length - 1]);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]) {
                    count[i]++;
                }
            }
        }
        return count;
    }
}
