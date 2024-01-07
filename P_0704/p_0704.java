public class p_0704 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }

    public static int search(int[] nums, int target) {
        int start = 0, mid, end = nums.length;
        while((start + 1) < end) {
            mid = (end + start) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(target < nums[mid]) {
                end = mid;
            } else {
                start = mid;
            }
        }

        return (nums[start] == target) ? start : -1;
    }
}
