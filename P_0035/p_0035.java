public class p_0035 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        for(int i = 0; i < 4; i++) {
            int mid = (low + high) / 2;
            if(nums[mid] < target) { low = mid; }
            else { high = mid; }
        }
        for(int i = low; i <= high; i++) {
            if(nums[i] >= target) { return i; }
        }
        return high + 1;
    }
}
